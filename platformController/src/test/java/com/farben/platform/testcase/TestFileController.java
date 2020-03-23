package com.farben.platform.testcase;

import com.alibaba.dubbo.remoting.transport.netty4.NettyClient;
import com.alibaba.fastjson.JSON;
import com.farben.platform.api.dto.FileInfoDTO;
import com.farben.platform.common.utils.FarbenUtils;
import com.farben.platform.testcase.common.CommonUtil;
import com.farben.platform.testcase.common.FarbenConst;
import com.jtest.NodesFactroy.Inject.Inject;
import com.jtest.NodesFactroy.Node.HttpClientNode;
import com.jtest.NodesFactroy.Node.JDbNode;
import com.jtest.annotation.JTest;
import com.jtest.annotation.JTestClass;
import com.jtest.annotation.JTestInject;
import com.jtest.testframe.ITestImpl;
import io.netty.channel.nio.NioEventLoopGroup;
import org.apache.http.HttpEntity;

import java.io.File;
import java.io.IOException;

@JTestClass.author("leijm")
public class TestFileController extends ITestImpl {

	String base_url = FarbenConst.base_url;
	String url_upload = base_url + "/file/upload";

	@JTestInject("iparkDev")
    JDbNode iparkDevDb;
	@JTestInject("iparkTest")
    JDbNode iparkTestDb;
	@Inject(filename = "node.xml", value = "httpclient")
    HttpClientNode httpclient;
	//AuthService.AuthToken authToken;

	@Override
	public void suiteSetUp() throws Exception {
		//authToken = new XwLogin().login(httpclient);

	}


	@Override
	public void suiteTearDown() throws IOException {

	}


	@Override
	public void setUp() {
	}


	@Override
	public void tearDown() {
	}




	//String base_url_dev = "http://localhost:8089";
	@JTest
	@JTestClass.title("test0001_upload  ")
	@JTestClass.pre("")
	@JTestClass.step("    ")
	@JTestClass.exp("test0001_upload")
	public void test0001_upload() throws Exception {

		String filename = getClass().getResource("/test/testfile/1.JPG").getPath();
		File file = new File(filename);
		HttpEntity entity = CommonUtil.buildMultipartEntity(url_upload, "authToken.getToken()", file);
		String ret = httpclient.post(url_upload, entity);
		httpclient.checkStatusCode(200);
		FileInfoDTO fileInfo = JSON.parseObject(ret, FileInfoDTO.class);
		System.out.println(url_upload);
		System.out.println(FarbenUtils.toJSONStringSkipNull(fileInfo));

	}

	@JTest
	@JTestClass.title("test0001_QueryActMaster and queryb invoice_order")
	@JTestClass.pre("")
	@JTestClass.step("  /ipark/act_master/query ")
	@JTestClass.exp("test0002_upload")
	public void test0002_upload() throws Exception {
//		String url_upload =  "http://119.23.206.143/upload";
//
//		String filename = getClass().getResource("/test/testfile/1.JPG").getPath();
//		File file = new File(filename);
//		HttpEntity entity = CommonUtil.buildMultipartEntity(url_upload, "authToken.getToken()", file);
//		String ret = httpclient.post(url_upload, entity);
//		httpclient.checkStatusCode(200);
//	 	System.out.println(ret);


	}

	NioEventLoopGroup dd;

	public static void main(String[] args) {
		run(TestFileController.class, 1);

	}


}
