package com.farben.platform.service.service;

import app.support.query.PageResult;
import com.farben.platform.api.dto.queryParam.MetadataQueryDTO;
import com.farben.platform.api.base.JsonResult;
import com.farben.platform.domain.CheckDictResult;
import com.farben.platform.domain.MetadataDictModel;
import com.farben.platform.domain.MetadataFieldModel;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.List;
import java.util.Map;

public interface MetadataJoinService {
    MetadataDictModel importDictTables(byte[] bytes) throws UnsupportedEncodingException;
    MetadataDictModel importDictTable(byte[] bytes) throws UnsupportedEncodingException;

    MetadataDictModel exportDictTable(Integer metadataId);

    List<MetadataDictModel> exportDictTables(String metadatIds);

    List<MetadataFieldModel> findAllByMetadataId(Integer metadataId, Integer limit);

    PageResult<Map<String, Object>> selectTable(MetadataQueryDTO q);

    PageResult<CheckDictResult> checkDict(Integer metadataId);

    JsonResult<Integer> makeDbTable(Integer metadataId);

    Boolean checkTableExists(Integer metadataId);

    JsonResult<Integer> dropDbTable(Integer metadataId);


    Integer copyMaster(Integer metadataId);

    Boolean checkExistsFieldByMetadataId(Integer metadataId);

    JsonResult<Integer> deleteAllByMetadataId(Integer metadataId);


    //WEB自动化工厂
    List<String> makeWebPage(Integer metadataId) throws IOException;

    void doSortMetadataDict(Integer subsysId, String ids);

    void doSortMetadataField(String ids);

    int dbImportTableFields(Integer metadataId);
    List<Integer> dbImportTables(Integer subsysId);

}