package com.shsxt.ego.manager.service.impl;

import com.shsxt.ego.common.model.EgoResult;
import com.shsxt.ego.common.model.PageResult;
import com.shsxt.ego.manager.service.IManagerItemService;
import com.shsxt.ego.rpc.pojo.TbItem;
import com.shsxt.ego.rpc.query.ItemQuery;
import com.shsxt.ego.rpc.service.IItemService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class ManagerItemServiceImpl implements IManagerItemService {
    @Resource
    private IItemService itemServiceProxy;
    @Override
    public PageResult<TbItem> itemList(ItemQuery itemQuery) {
        return itemServiceProxy.queryItemsListByParams(itemQuery);
    }

    @Override
    public EgoResult reshelf(Long[] ids) {
        return itemServiceProxy.updateItemStatusBatch(ids,1);
    }

    @Override
    public EgoResult instock(Long[] ids) {
        return itemServiceProxy.updateItemStatusBatch(ids,2);
    }

    @Override
    public EgoResult deleteItemBatch(Long[] ids) {
        return itemServiceProxy.deleteItemBatch(ids);
    }
}
