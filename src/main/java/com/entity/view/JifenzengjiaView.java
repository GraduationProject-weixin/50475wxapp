package com.entity.view;

import com.entity.JifenzengjiaEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 积分增加
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-02-28 16:44:52
 */
@TableName("jifenzengjia")
public class JifenzengjiaView  extends JifenzengjiaEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public JifenzengjiaView(){
	}
 
 	public JifenzengjiaView(JifenzengjiaEntity jifenzengjiaEntity){
 	try {
			BeanUtils.copyProperties(this, jifenzengjiaEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
