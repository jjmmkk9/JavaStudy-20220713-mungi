/*
여러줄 주석
	DML
	CRUD
	C	=	insert
	R	=	select
	U	=	update
	D	=	delete
*/

#한줄주석
#insert 데이터 추가
#행 이름 생략가능 => 순서대로 입력
INSERT INTO 
	user_mst
	VALUES(
	0,
	'mungi5', 
	'1234');
	
#데이터 여러개를 한번에 insert하는 방법
INSERT INTO 
	user_mst
	VALUES(
	0,
	'mungi6', 
	'1234'),
	(
	0,
	'mungi7', 
	'1234'),
	(
	0,
	'mungi8', 
	'1234');

#select 조회
#자바에서 데이터 필요할때 select로 가져오기
SELECT 
	*
FROM
	user_mst
WHERE 
/*	user_code > 3 
	AND user_code < 6; 
	user_id = 'mungi';	*/
	
	#user_id LIKE '%gi%';
	#user_id 가 '&gi&' 'gi'을 포함하기만 하면 검색해라
	#user_id LIKE 'mungi%';
	#user_id 가 '문자열&'  문자열로 시작하면 검색해라
	#user_id in('mungi3', 'mungi4'); 아래 or랑 동일
	/*user_id = 'mungi3'
	OR user_id = 'mungi4'; */
	
#where 서브쿼리
	user_id IN(
		select
			user_id
		from
			user_mst
		where
			user_code > 1
			AND user_code < 6
	);
	
#update

UPDATE
	user_mst
SET
	user_password = '1111',
	user_id = 'mungi666'
WHERE
	user_code = (
	select
		user_code
	from
		user_mst
	where
		user_id = 'mungi6'
	);
	
#delete
DELETE
FROM
	user_mst
WHERE
	user_code = 6;
continents