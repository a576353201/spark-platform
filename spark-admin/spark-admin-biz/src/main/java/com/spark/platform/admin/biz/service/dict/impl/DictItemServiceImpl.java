package com.spark.platform.admin.biz.service.dict.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.spark.platform.admin.api.entity.dict.DictItem;
import com.spark.platform.admin.biz.dao.dict.DictItemDao;
import com.spark.platform.admin.biz.service.dict.DictItemService;
import com.spark.platform.common.base.constants.RedisConstants;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ProjectName: spark-platform
 * @Package: com.spark.platform.adminbiz.service.dict.impl
 * @ClassName: DictItemServiceImpl
 * @Author: wangdingfeng
 * @Description:
 * @Date: 2020/3/26 10:18
 * @Version: 1.0
 */
@Service
public class DictItemServiceImpl extends ServiceImpl<DictItemDao, DictItem> implements DictItemService {
    @Override
    @Cacheable(value = RedisConstants.DICT_CACHE, unless = "#result == null", key = "T(com.spark.platform.common.base.constants.RedisConstants).DICT_KEY_PREFIX.concat(T(String).valueOf(#type))")
    public List<DictItem> findItemType(String type) {
        return super.list(new QueryWrapper<DictItem>().eq("type",type));
    }
}
