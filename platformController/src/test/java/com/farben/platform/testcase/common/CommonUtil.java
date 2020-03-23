package com.farben.platform.testcase.common;

import org.apache.http.HttpEntity;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.mime.MultipartEntityBuilder;
import org.apache.http.entity.mime.content.FileBody;

import java.io.File;

public class CommonUtil {

  public static HttpEntity buildMultipartEntity(String url, String accessToken, File file) {
    MultipartEntityBuilder multipartEntity = MultipartEntityBuilder.create();
    multipartEntity.setContentType(ContentType.MULTIPART_FORM_DATA);

    FileBody fileBody = new FileBody(file);
    multipartEntity.addPart("file", fileBody);
    multipartEntity.addTextBody("access-token", accessToken);
    return multipartEntity.build();
  }


}
