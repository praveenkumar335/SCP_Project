package com.telusuko.rest.springbootrest.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyselfResource {
	@RequestMapping("/b")
		public List<Myself> getMyself(){
	List<Myself> m=new ArrayList<Myself>();
Myself m1=new Myself();
m1.setName("Gunnala komuraiah");
m1.setId(123);
m1.setAdd("Velair");
m1.setMail("km@kmh.com");
Myself m2=new Myself();
m2.setName("Gunnala veeramma");
m2.setId(124);
m2.setAdd("Velair");
m2.setMail("vm@kmh.com");
m.add(m1);
m.add(m2);
return m;
}
}
