# Spring Boot REST API

# 학습내용
`@Controller` : 해당 컨트롤러 클래스를 MVC 컨트롤러로 만듦

`@ResponseBody` : JAVA 객체에서 JSON으로 응답을 변환

`@RestController` : `@Controller` + `@ResponseBody` -> 두 어노테이션을 조합해서 더 간단하게 나타냄

`@GetMapping` : 해당 메소드를 GET 방식으로 매핑

`@PathVariable` : URI 템플릿 변수의 값을 메서드에 바인딩하는 데 사용

`@RequestParam` : 요청에서 쿼리 매개변수 의 값을 추출

`@PostMapping` : 들어오는 HTTP POST를 해당 메서드에 대한 요청에 매핑

`@ResponseStatus` : 응답으로 HTTP 상태코드를 보내기 위해서 사용

`@RequestBody` : Json객체를 검색하고 해당 JSON 객체를 자바 객체로 변환

`@PutMapping` : 해당 메소드를 PUT 방식으로 매핑

`@DeleteMapping` : 해당 메소드를 DELETE 방식으로 매핑

`@RequestMapping` : 모든 메소드마다 공통의 URL을 정의해서 메소드마다 동일한 URL이 반복되지 않게 설정해주는 역할
ResponseEntity : ResponseEntity 클래스를 사용하면, 결과값, 상태코드,  헤더값을 모두 프론트에 넘겨줄 수 있고, 에러코드 또한 섬세하게 설정해서 보내줄 수 있다는 장점이 있음
