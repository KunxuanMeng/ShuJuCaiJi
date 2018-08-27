package com.etc.MapReduce;

import org.apache.commons.io.FileUtils;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.NullWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;
import org.apache.hadoop.mapreduce.lib.output.LazyOutputFormat;
import org.apache.hadoop.mapreduce.lib.output.TextOutputFormat;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MapReduceSubmit {
    public static void main(String[] args) throws  Exception{
        Configuration configuration = new Configuration();
        Job job = Job.getInstance(configuration);
        job.setJarByClass(MapReduceSubmit.class);


        job.setMapperClass(MapReduceMap.class);

        job.setOutputKeyClass(Text.class);
        job.setOutputValueClass(NullWritable.class);

        job.setNumReduceTasks(0);
        LazyOutputFormat.setOutputFormatClass(job,TextOutputFormat.class);


        File output=new File("f:/shuchu/20180825");
        if (output.exists()){
            FileUtils.deleteDirectory(output);
        }
        FileInputFormat.setInputPaths(job,new Path("F:\\mapshuru\\20180825"));
        FileOutputFormat.setOutputPath(job,new Path("f:\\shuchu\\20180825"));
        System.out.println(job.waitForCompletion(true));

    }

    public static  String datefilename(){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd");

        return String.valueOf ((Long.parseLong(simpleDateFormat.format(new Date()))) - 1);
    }
}
