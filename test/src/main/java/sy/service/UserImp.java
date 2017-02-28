package sy.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sy.dao.CityMapper;
import sy.model.City;

/**
 * Created by pc on 2017/2/28.
 */
@Service("userService")
public class UserImp implements User {

    public CityMapper getCityMapper() {
        return cityMapper;
    }

    public void setCityMapper(CityMapper cityMapper) {
        this.cityMapper = cityMapper;
    }
    @Autowired
    private CityMapper cityMapper;

    public City selectByPrimaryKey(int id){
        return cityMapper.selectByPrimaryKey(id);
    }
}
