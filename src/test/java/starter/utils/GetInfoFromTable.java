package starter.utils;

import io.cucumber.datatable.DataTable;
import starter.models.RegisterBasicUserInfoModel;

import java.util.List;
import java.util.Map;

public class GetInfoFromTable {

    public static RegisterBasicUserInfoModel getBasicUserInfoData(DataTable userInfo){
        List<Map<String, String>> data = userInfo.asMaps(String.class, String.class);
        Map<String, String> column = data.get(0);

        RegisterBasicUserInfoModel userBasicInfoModel = new RegisterBasicUserInfoModel();

        userBasicInfoModel.setName(column.get("name"));
        userBasicInfoModel.setEmail(column.get("email"));

        return userBasicInfoModel;
    }
}
