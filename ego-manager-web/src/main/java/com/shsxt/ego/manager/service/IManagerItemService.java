package com.shsxt.ego.manager.service;

import com.shsxt.ego.common.model.EgoResult;
import com.shsxt.ego.common.model.PageResult;
import com.shsxt.ego.rpc.pojo.TbItem;
import com.shsxt.ego.rpc.query.ItemQuery;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

public interface IManagerItemService {
    public PageResult<TbItem> itemList(ItemQuery itemQuery);


    /**
     * 商品上架
     * @param ids
     * @return
     */
    public EgoResult reshelf(Long[] ids);

    /**
     * 商品下架
     * @param ids
     * @return
     */
    public EgoResult instock(Long[] ids);


    EgoResult deleteItemBatch(Long[] ids);
}
