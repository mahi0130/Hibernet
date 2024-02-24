package in.co.rays.UserDTO;

import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class TestUser {
	public static void main(String[] args) {
		//add();
	//update();
//		delete();
	//	authenticate();
//	testSearch();
		get();
	}

	private static void add() {
		UserDTO dto = new UserDTO();
		dto.setId(1);
		dto.setFirstName("kiyara");
		dto.setLastName("advani");
		dto.setLogin("kia@gmail.com");
		dto.setPassword("k123");
		dto.setDob(new Date());
		dto.setAddress("bhopal");
		UserModel model = new UserModel();
		model.add(dto);
	}

	private static void testSearch() {
		UserDTO dto = new UserDTO();
		dto.setFirstName("hema");
		UserModel model = new UserModel();
		List list =model.search(dto, 1, 10);
		Iterator it = list.iterator();
		while (it.hasNext()) {
			dto = (UserDTO ) it.next();
			
			System.out.println(dto.getId());
			System.out.println(dto.getFirstName());
			System.out.println(dto.getLastName());
			System.out.println(dto.getLogin());
			System.out.println(dto.getPassword());
			System.out.println(dto.getDob());
			System.out.println(dto.getAddress());
			
			}
	}
	private static void authenticate() {
		UserModel model = new UserModel();
		UserDTO dto = model.authenticate("hema@gmail.com", "h123");
		if (dto != null) {
			System.out.println(dto.getId());
			System.out.println(dto.getFirstName());
			System.out.println(dto.getLastName());
			System.out.println(dto.getLogin());
			System.out.println(dto.getPassword());
			System.out.println(dto.getDob());
			System.out.println(dto.getAddress());
		} else {
			System.out.println("authentication failed");
		}

	}

	private static void delete() {
		UserDTO dto = new UserDTO();
		dto.setId(2);
		UserModel model = new UserModel();
		model.delete(dto);
	}

	private static void get() {
		UserModel model = new UserModel();
		UserDTO dto = model.findByPk(1);
		System.out.println(dto.getId());
		System.out.println(dto.getFirstName());
		System.out.println(dto.getLastName());
		System.out.println(dto.getLogin());
		System.out.println(dto.getPassword());
		System.out.println(dto.getDob());
		System.out.println(dto.getAddress());

	}

	private static void update() {
		UserDTO dto = new UserDTO();
		dto.setId(1);
		dto.setFirstName("hema");
		dto.setLastName("malini");
		dto.setLogin("hema@gmail.com");
		dto.setPassword("h123");
		dto.setDob(new Date());
		dto.setAddress("ilahabad");
		UserModel model = new UserModel();
		model.update(dto);
	}

}
