package com.neusoft.busmis.security.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.neusoft.busmis.security.model.ModuleModel;
import com.neusoft.busmis.security.model.RoleModel;

//角色DAO接口
@Mapper
public interface IRoleDao {
	//增加角色
	public void create(RoleModel role) throws Exception;
	//修改角色
	public void update(RoleModel role) throws Exception;
	//删除角色
	public void delete(RoleModel role) throws Exception;
	//取得所有角色列表
	public List<RoleModel> selectListByAll() throws Exception;
	
	//取得角色列表，并取得关联的用户属性列表，使用内嵌式select方式
	public List<RoleModel> selectListByAllWithUsersByNestedSelect() throws Exception;
	//取得角色列表，并取得关联的用户属性列表，使用内嵌式ResultMap方式
	public List<RoleModel> selectListByAllWithUsersByNestedResultMap() throws Exception;
	//取得角色列表，并取得关联的模块属性列表，使用内嵌式select方式
	public List<RoleModel> selectListByAllWithModulesByNestedSelect() throws Exception;
	//取得角色列表，并取得关联的模块属性列表，使用内嵌式ResultMap方式
	public List<RoleModel> selectListByAllWithModulesByNestedResultMap() throws Exception;
	
	//取得角色列表，并取得关联的用户和模块属性列表，使用内嵌式select方式
	public List<RoleModel> selectListByAllWithUsersAndModulesByNestedSelect() throws Exception;
	//取得角色列表，并取得关联的用户和模块属性列表，使用内嵌式ResultMap方式
	public List<RoleModel> selectListByAllWithFunctionsAndModulesByNestedResultMap() throws Exception;
	
	//取得指定模块的角色列表
	public List<RoleModel> selectListByModule(int moduleNo) throws Exception;
	//取得指定用户的角色列表
	public List<RoleModel> selectListByUser(String userId) throws Exception;
	//取得指定的角色
	public RoleModel selectByNo(int no) throws Exception;
	//取得所有角色的个数
	public int selectCountByAll() throws Exception;
	
	
	

}
