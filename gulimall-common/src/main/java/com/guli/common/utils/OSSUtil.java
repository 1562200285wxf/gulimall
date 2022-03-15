package com.guli.common.utils;

import com.aliyun.oss.OSS;
import com.aliyun.oss.OSSClient;
import com.aliyun.oss.OSSClientBuilder;
import com.aliyun.oss.model.BucketInfo;

/**
 * @author ：wang xiaofeng
 * @date ：Created in 2022/3/15 15:16
 * @description：
 */
public class OSSUtil {
    private static String endpoint = "http://oss-cn-beijing.aliyuncs.com";
    private static String accessKeyId = "LTAI5tK7HuhosStu5bQm18Ba";
    private static String accessKeySecret = "WPMGmca7yaAaWr3rdjZQwv8fLCgi3Y";
    private static String bucketName = "wxf-oss-bucket";

    public static OSS getOss() {
        return new OSSClientBuilder().build(endpoint, accessKeyId, accessKeySecret);
    }

    public static void getBucketInfo(OSS oss){
        // 查看Bucket信息。
        BucketInfo info = oss.getBucketInfo(bucketName);
        System.out.println("Bucket " + bucketName + "的信息如下：");
        System.out.println("\t数据中心：" + info.getBucket().getLocation());
        System.out.println("\t创建时间：" + info.getBucket().getCreationDate());
        System.out.println("\t用户标志：" + info.getBucket().getOwner());
    }

    public static void main(String[] args) {
        getBucketInfo(OSSUtil.getOss());
    }
}
