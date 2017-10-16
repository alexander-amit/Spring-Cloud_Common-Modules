package amit.sap.cloudcommon.client;


import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import amit.sap.cloudcommon.domain.Room;

import java.util.List;


@FeignClient(value="ROOMSERVICES")
public interface RoomService {

    @RequestMapping(value="/rooms", method= RequestMethod.GET)
    List<Room> findAll(@RequestParam(name="roomNumber", required=false)String roomNumber);
}
