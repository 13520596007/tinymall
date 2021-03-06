package com.attitude.tinymall.db.dao;

import com.attitude.tinymall.db.domain.LitemallProduct;
import com.attitude.tinymall.db.domain.LitemallProductExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LitemallProductMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tinymall_product
     *
     * @mbg.generated
     */
    long countByExample(LitemallProductExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tinymall_product
     *
     * @mbg.generated
     */
    int deleteByExample(LitemallProductExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tinymall_product
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tinymall_product
     *
     * @mbg.generated
     */
    int insert(LitemallProduct record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tinymall_product
     *
     * @mbg.generated
     */
    int insertSelective(LitemallProduct record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tinymall_product
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    LitemallProduct selectOneByExample(LitemallProductExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tinymall_product
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    LitemallProduct selectOneByExampleSelective(@Param("example") LitemallProductExample example, @Param("selective") LitemallProduct.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tinymall_product
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    List<LitemallProduct> selectByExampleSelective(@Param("example") LitemallProductExample example, @Param("selective") LitemallProduct.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tinymall_product
     *
     * @mbg.generated
     */
    List<LitemallProduct> selectByExample(LitemallProductExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tinymall_product
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    LitemallProduct selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") LitemallProduct.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tinymall_product
     *
     * @mbg.generated
     */
    LitemallProduct selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tinymall_product
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    LitemallProduct selectByPrimaryKeyWithLogicalDelete(@Param("id") Integer id, @Param("andLogicalDeleted") boolean andLogicalDeleted);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tinymall_product
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") LitemallProduct record, @Param("example") LitemallProductExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tinymall_product
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") LitemallProduct record, @Param("example") LitemallProductExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tinymall_product
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(LitemallProduct record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tinymall_product
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(LitemallProduct record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tinymall_product
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int logicalDeleteByExample(@Param("example") LitemallProductExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tinymall_product
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int logicalDeleteByPrimaryKey(Integer id);
}