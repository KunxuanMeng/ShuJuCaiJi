package com.etc.Model;

public class ShujuModel {

    /**
     * header : {"country":"CN","device_model":"HUAWEI VNS-AL00","city":"江门市","app_token":"XIAONIU_A","pid":"pid","language":"zh","commit_time":"1502686418952","device_id_type":"mac","resolution":"1080x1920","mac":"1c:77:f6:78:f5:75","app_ver_code":"4010104","release_channel":"1009","cid_sn":"1501004207EE98AA","app_id":"com.appid.xiaoniu","os_ver":"22","device_id":"m.1c:77:f6:78:f5:75","net_type":"3","promotion_channel":"1","app_device_id":"m.1c:77:f6:78:f5:75","time_zone":"28800000","manufacture":"OPPO","carrier":"中国xx","build_num":"YVF6R16303000403","imei":"867830021735040","os_name":"android","mobile_data_type":"","sdk_ver":"103","android_id":"867830021735040","commit_id":"fde7ee2e48494b24bf3599771d7c2a78","app_ver_name":"1.4","account":"none"}
     * events : 14733672361430connectByQRCode01609072239570000027
     14733672619330AppLaunch01609072239570000028
     14733672803490connectByQRCode01609072239570000029
     14733673313260AppLaunch01609072239570000030
     14733673533100connectByQRCode01609072239570000031
     14733673870870AppLaunch01609072239570000032
     14733674021670connectByQRCode01609072239570000033
     14733674519940AppLaunch01609072239570000034
     14733674743160connectByQRCode01609072239570000035
     14733675641810AppLaunch01609072239570000036
     14733675895270connectByQRCode01609072239570000037
     14733676103100AppLaunch01609072239570000038
     14733676246470connectByQRCode01609072239570000039
     14733680042980AppLaunch01609072239570000040
     14733680178510connectByQRCode01609072239570000041
     14733695990670AppLaunch01609072239570000042
     14733696222740connectByQRCode01609072239570000043

     */
    private HeaderEntity header;
    private String events;

    public void setHeader(HeaderEntity header) {
        this.header = header;
    }

    public void setEvents(String events) {
        this.events = events;
    }

    public HeaderEntity getHeader() {
        return header;
    }

    public String getEvents() {
        return events;
    }

    public class HeaderEntity {
        /**
         * country : CN
         * device_model : HUAWEI VNS-AL00
         * city : 江门市
         * app_token : XIAONIU_A
         * pid : pid
         * language : zh
         * commit_time : 1502686418952
         * device_id_type : mac
         * resolution : 1080x1920
         * mac : 1c:77:f6:78:f5:75
         * app_ver_code : 4010104
         * release_channel : 1009
         * cid_sn : 1501004207EE98AA
         * app_id : com.appid.xiaoniu
         * os_ver : 22
         * device_id : m.1c:77:f6:78:f5:75
         * net_type : 3
         * promotion_channel : 1
         * app_device_id : m.1c:77:f6:78:f5:75
         * time_zone : 28800000
         * manufacture : OPPO
         * carrier : 中国xx
         * build_num : YVF6R16303000403
         * imei : 867830021735040
         * os_name : android
         * mobile_data_type :
         * sdk_ver : 103
         * android_id : 867830021735040
         * commit_id : fde7ee2e48494b24bf3599771d7c2a78
         * app_ver_name : 1.4
         * account : none
         */
        private String country;
        private String device_model;
        private String city;
        private String app_token;
        private String pid;
        private String language;
        private String commit_time;
        private String device_id_type;
        private String resolution;
        private String mac;
        private String app_ver_code;
        private String release_channel;
        private String cid_sn;
        private String app_id;
        private String os_ver;
        private String device_id;
        private String net_type;
        private String promotion_channel;
        private String app_device_id;
        private String time_zone;
        private String manufacture;
        private String carrier;
        private String build_num;
        private String imei;
        private String os_name;
        private String mobile_data_type;
        private String sdk_ver;
        private String android_id;
        private String commit_id;
        private String app_ver_name;
        private String account;
        private String user_id;
        public void setUser_id(String user_id){
            this.user_id=user_id;
        }
        public String getUser_id(){
            return this.user_id;
        }
        public void setCountry(String country) {
            this.country = country;
        }

        public void setDevice_model(String device_model) {
            this.device_model = device_model;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public void setApp_token(String app_token) {
            this.app_token = app_token;
        }

        public void setPid(String pid) {
            this.pid = pid;
        }

        public void setLanguage(String language) {
            this.language = language;
        }

        public void setCommit_time(String commit_time) {
            this.commit_time = commit_time;
        }

        public void setDevice_id_type(String device_id_type) {
            this.device_id_type = device_id_type;
        }

        public void setResolution(String resolution) {
            this.resolution = resolution;
        }

        public void setMac(String mac) {
            this.mac = mac;
        }

        public void setApp_ver_code(String app_ver_code) {
            this.app_ver_code = app_ver_code;
        }

        public void setRelease_channel(String release_channel) {
            this.release_channel = release_channel;
        }

        public void setCid_sn(String cid_sn) {
            this.cid_sn = cid_sn;
        }

        public void setApp_id(String app_id) {
            this.app_id = app_id;
        }

        public void setOs_ver(String os_ver) {
            this.os_ver = os_ver;
        }

        public void setDevice_id(String device_id) {
            this.device_id = device_id;
        }

        public void setNet_type(String net_type) {
            this.net_type = net_type;
        }

        public void setPromotion_channel(String promotion_channel) {
            this.promotion_channel = promotion_channel;
        }

        public void setApp_device_id(String app_device_id) {
            this.app_device_id = app_device_id;
        }

        public void setTime_zone(String time_zone) {
            this.time_zone = time_zone;
        }

        public void setManufacture(String manufacture) {
            this.manufacture = manufacture;
        }

        public void setCarrier(String carrier) {
            this.carrier = carrier;
        }

        public void setBuild_num(String build_num) {
            this.build_num = build_num;
        }

        public void setImei(String imei) {
            this.imei = imei;
        }

        public void setOs_name(String os_name) {
            this.os_name = os_name;
        }

        public void setMobile_data_type(String mobile_data_type) {
            this.mobile_data_type = mobile_data_type;
        }

        public void setSdk_ver(String sdk_ver) {
            this.sdk_ver = sdk_ver;
        }

        public void setAndroid_id(String android_id) {
            this.android_id = android_id;
        }

        public void setCommit_id(String commit_id) {
            this.commit_id = commit_id;
        }

        public void setApp_ver_name(String app_ver_name) {
            this.app_ver_name = app_ver_name;
        }

        public void setAccount(String account) {
            this.account = account;
        }

        public String getCountry() {
            return country;
        }

        public String getDevice_model() {
            return device_model;
        }

        public String getCity() {
            return city;
        }

        public String getApp_token() {
            return app_token;
        }

        public String getPid() {
            return pid;
        }

        public String getLanguage() {
            return language;
        }

        public String getCommit_time() {
            return commit_time;
        }

        public String getDevice_id_type() {
            return device_id_type;
        }

        public String getResolution() {
            return resolution;
        }

        public String getMac() {
            return mac;
        }

        public String getApp_ver_code() {
            return app_ver_code;
        }

        public String getRelease_channel() {
            return release_channel;
        }

        public String getCid_sn() {
            return cid_sn;
        }

        public String getApp_id() {
            return app_id;
        }

        public String getOs_ver() {
            return os_ver;
        }

        public String getDevice_id() {
            return device_id;
        }

        public String getNet_type() {
            return net_type;
        }

        public String getPromotion_channel() {
            return promotion_channel;
        }

        public String getApp_device_id() {
            return app_device_id;
        }

        public String getTime_zone() {
            return time_zone;
        }

        public String getManufacture() {
            return manufacture;
        }

        public String getCarrier() {
            return carrier;
        }

        public String getBuild_num() {
            return build_num;
        }

        public String getImei() {
            return imei;
        }

        public String getOs_name() {
            return os_name;
        }

        public String getMobile_data_type() {
            return mobile_data_type;
        }

        public String getSdk_ver() {
            return sdk_ver;
        }

        public String getAndroid_id() {
            return android_id;
        }

        public String getCommit_id() {
            return commit_id;
        }

        public String getApp_ver_name() {
            return app_ver_name;
        }

        public String getAccount() {
            return account;
        }

        @Override
        public String toString() {
            return
                     country  +
                    "," + device_model  +
                    "," + app_token  +
                    "," + pid +
                    "," + language +
                    "," + commit_time  +
                    "," + device_id_type  +
                    "," + resolution  +
                    "," + app_ver_code +
                    "," + release_channel +
                    "," + app_id +
                    "," + os_ver +
                    "," + device_id +
                    "," + net_type +
                    "," + time_zone  +
                    "," + manufacture +
                    "," + os_name +
                    "," + sdk_ver +
                    "," + commit_id +
                    "," + app_ver_name+
                    "," + user_id;

        }
    }

    @Override
    public String toString() {
        return  header.toString() ;

    }
}
