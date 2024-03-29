package com.changgou.goods.service;
import com.changgou.goods.pojo.Goods;
import com.changgou.goods.pojo.Spu;
import com.github.pagehelper.PageInfo;
import java.util.List;
/****
 * @Author:Dj
 * @Description:Spu业务层接口
 * @Date 2023年8月11日
 *****/
public interface SpuService {



    /***
     * 批量下架
     * @param ids
     * @return
     */
    int pullMany(Long[] ids);

    /***
     * 批量上架
     * @param ids
     * @return
     */
    int putMany(Long[] ids);

    /***
     * 商品上架
     * @param spuId
     */
    void put(Long spuId);


    /***
     * Spu多条件分页查询
     * @param spu
     * @param page
     * @param size
     * @return
     */
    PageInfo<Spu> findPage(Spu spu, int page, int size);

    /***
     * Spu分页查询
     * @param page
     * @param size
     * @return
     */
    PageInfo<Spu> findPage(int page, int size);

    /***
     * Spu多条件搜索方法
     * @param spu
     * @return
     */
    List<Spu> findList(Spu spu);

    /***
     * 删除Spu
     * @param id
     */
    void delete(Long id);

    /***
     * 修改Spu数据
     * @param spu
     */
    void update(Spu spu);

    /***
     * 新增Spu
     * @param spu
     */
    void add(Spu spu);

    /**
     * 根据ID查询Spu
     * @param id
     * @return
     */
     Spu findById(Long id);

    /***
     * 查询所有Spu
     * @return
     */
    List<Spu> findAll();

    /**
     * 添加商品(SPU+ SKUlIST)
     * @param goods   update  add
     */
    void save(Goods goods);

    Goods findGoodsById(Long id);

    /***
     * 商品审核
     * @param spuId
     */
    void auditSpu(Long spuId);

    /***
     * 商品下架
     * @param id Spu的ID
     */
    void pullSpu(Long id);

    /**
     * 逻辑删除
     * @param id
     * @return
     */
    void logicDeleteSpu(Long id);


    /***
     * 还原被删除商品
     * @param id
     */
    void restoreSpu(Long id);
}
