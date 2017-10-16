package amit.sap.cloudcommon;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import amit.sap.cloudcommon.client.RoomService;
import amit.sap.cloudcommon.domain.Room;

import java.util.List;

@RestController
public class RoomReservationController {
	
	@Autowired
	private RoomService roomService;

	/*@Autowired
	private RestTemplate restTemplate;*/

	/*@RequestMapping(value = "/rooms", method = RequestMethod.GET)
	public List<Room> getAllRooms() {
		ResponseEntity<List<Room>> roomsResponse = this.restTemplate.exchange("http://ROOMSERVICES/rooms",
				HttpMethod.GET, null, new ParameterizedTypeReference<List<Room>>() {
				});
		return roomsResponse.getBody();
	}*/
	
	@RequestMapping(value = "/rooms", method = RequestMethod.GET)
    public List<Room> getAllRooms(){
        return this.roomService.findAll(null);
        }

}
