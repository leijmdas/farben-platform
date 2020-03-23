package com.farben.platform.dubbo;

import com.alibaba.dubbo.config.annotation.Service;
import com.farben.platform.api.dto.FileInfoDTO;
import com.farben.platform.api.service.FileApiService;
import com.farben.platform.service.impl.FastDFSService;
import org.springframework.beans.factory.annotation.Value;

import java.util.Map;

@Service(version = "${dubbo.service.version}")
public class FileApiProvider implements FileApiService {

	@Value("${file.server}")
	private String fileServer;
	@Override
	public FileInfoDTO upload(String name, String ext, byte[] bytes, Map<String, String> props) {
		FileInfoDTO r = new FileInfoDTO();
		try {
			String path = FastDFSService.upload(name, ext, bytes, null);
			r.setExt(ext);
			r.setName(name);
			r.setPath(fileServer + "/" + path);
			r.setSize((long) bytes.length);
			return r;
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	@Override
	public byte[] download(String groupName, String remoteFileName) {
		try {
			byte[] content = FastDFSService.download(groupName, remoteFileName);
			return content;
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
	@Override
	public Integer delete(String groupName, String remoteFileName) {
		try {
			 return FastDFSService.delete(groupName, remoteFileName);

		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

}
