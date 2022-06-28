package com.example.mes.template.service;

import com.example.mes.process.Vo.MaterialVo.DeleteMaterialVo;
import com.example.mes.process.Vo.MaterialVo.InsertMaterialVo;
import com.example.mes.process.Vo.MaterialVo.QueryMaterialVo;
import com.example.mes.process.Vo.MaterialVo.UpdateMaterialVo;
import com.example.mes.template.entity.EquipmentTemplate;
import com.example.mes.template.entity.MaterialTemplate;
import com.example.mes.template.vo.MaterialTemplateVo;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public interface TemplateServiceImpl {
        List<MaterialTemplate> getAllMaterial(String company_id);
        List<MaterialTemplate> getMaterialTemplateByName(String name,String company_id);
        //跟据物料模板id查询对应物料的信息
        List<MaterialTemplate> getMaterialTemplateByID(int material_id,String company_id);
        //增加一个物料模板
        String addMaterialTemplate(MaterialTemplateVo materialTemplateVo);
        //根据物料模板id删除一个物料
        String deleteMaterialTemplate(MaterialTemplateVo materialTemplateVo);
        //修改一个物料模板
        String updateMaterialTemplate(MaterialTemplateVo materialTemplateVo);



        public List<EquipmentTemplate> getEquipmentTemplateByID(int equipment_id);

        public List<EquipmentTemplate> getEquipmentTemplateByName(String name);

        public List<EquipmentTemplate> getAllEquipment();




}