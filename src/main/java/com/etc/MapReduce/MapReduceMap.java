package com.etc.MapReduce;

import com.alibaba.fastjson.JSONObject;
import com.etc.Model.ShujuModel;
import com.google.gson.JsonObject;
import com.sun.prism.impl.shape.ShapeUtil;
import org.apache.hadoop.hdfs.web.JsonUtil;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.NullWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapred.IFile;
import org.apache.hadoop.mapred.lib.MultipleOutputFormat;
import org.apache.hadoop.mapreduce.Mapper;
import org.apache.hadoop.mapreduce.lib.output.MultipleOutputs;

import java.io.IOException;


public class MapReduceMap extends Mapper<LongWritable, Text, Text, NullWritable> {

    private MultipleOutputs<Text, NullWritable> multiple;

    protected void setup(Context context) {
        Text k = null;
        NullWritable v = null;
        multiple = new MultipleOutputs<Text, NullWritable>(context);
    }

    @Override
    protected void map(LongWritable key, Text value, Context context) throws IOException, InterruptedException {
        ShujuModel shujuModel = JSONObject.parseObject(value.toString(), ShujuModel.class);
        if (!shujuModel.getHeader().getSdk_ver().equals("") &&
                !shujuModel.getHeader().getSdk_ver().equals("") &&
                !shujuModel.getHeader().getTime_zone().equals("") &&
                !shujuModel.getHeader().getCommit_id().equals("") &&
                !shujuModel.getHeader().getPid().equals("") &&
                !shujuModel.getHeader().getApp_token().equals("") &&
                !shujuModel.getHeader().getApp_id().equals("") &&
                !shujuModel.getHeader().getDevice_id_type().equals("") &&
                !shujuModel.getHeader().getRelease_channel().equals("") &&
                !shujuModel.getHeader().getApp_ver_name().equals("") &&
                !shujuModel.getHeader().getApp_ver_code().equals("") &&
                !shujuModel.getHeader().getOs_name().equals("") &&
                !shujuModel.getHeader().getOs_ver().equals("") &&
                !shujuModel.getHeader().getLanguage().equals("") &&
                !shujuModel.getHeader().getCountry().equals("") &&
                !shujuModel.getHeader().getManufacture().equals("") &&
                !shujuModel.getHeader().getDevice_model().equals("") &&
                !shujuModel.getHeader().getResolution().equals("") &&
                !shujuModel.getHeader().getNet_type().equals("")
                ) {
            if (shujuModel.getHeader().getOs_name().equals("android")) {
                shujuModel.getHeader().setUser_id(shujuModel.getHeader().getAndroid_id());
                if (shujuModel.getHeader().getAndroid_id().equals("")) {
                    shujuModel.getHeader().setUser_id(shujuModel.getHeader().getDevice_id());

                }
                shujuModel.getHeader().setCommit_time(String.valueOf(
                        (Long.parseLong(shujuModel.getHeader().getCommit_time()))
                                + 1000 * 60 * 60 * 24 * 365 * 2));
            }
            if (shujuModel.getHeader().getOs_name().equals("ios")) {
                shujuModel.getHeader().setUser_id(shujuModel.getHeader().getDevice_id());
                shujuModel.getHeader().setCommit_time(String.valueOf(
                        (Long.parseLong(shujuModel.getHeader().getCommit_time()))
                                + 1000 * 60 * 60 * 24 * 365 * 2));

            }

            if (shujuModel.getHeader().getOs_name().equals("android"))
                multiple.write(new Text(shujuModel.getHeader().toString()), NullWritable.get(), "android/an");
            if (shujuModel.getHeader().getOs_name().equals("ios"))
                multiple.write(new Text(shujuModel.getHeader().toString()), NullWritable.get(), "ios/io");
        }
    }
        @Override
        protected void cleanup (Context context) throws IOException, InterruptedException {
            multiple.close();
        }

}



