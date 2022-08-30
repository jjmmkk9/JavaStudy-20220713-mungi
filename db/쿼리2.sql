
UPDATE 
	product_mst
SET
	product_price = product_price + 10000
WHERE
	product_name LIKE '%텀블러';
	
	
SELECT *
FROM product_mst;


#category_mst insert
INSERT INTO 
	category_mst
	VALUES(
		0,
		'텀블러'
	),
	(
		0,
		'머그컵'
	),
	(
		0,
		'음료'
	);
	
	
SELECT
	pm.product_code,
	pm.product_name,
	pm.product_category,
	cm.category_name,
	pm.product_price
FROM
	product_mst pm /* pm cm 은 별명 join 할때는 별명 붙여줘야됨 */
	LEFT OUTER JOIN category_mst cm ON(cm.category_code = pm.product_category)
;


INSERT INTO
	order_mst
	VALUES(
		0,
		4,
		4,
		NOW()
	);
	
	
SELECT
	om.order_code,
	om.order_user,
	um.user_id,
	om.order_product,
	pm.product_name,
	pm.product_category,
	cm.category_name,
	pm.product_price,
	om.order_datetime
FROM
	order_mst om
	LEFT OUTER JOIN user_mst um ON(um.user_code = om.order_user)
	LEFT OUTER JOIN product_mst pm ON(pm.product_code = om.order_product)
	LEFT OUTER JOIN category_mst cm ON(cm.category_code = pm.product_category)

;
WHERE
	om.order_code > 1
	AND pm.product_price > 20000;


DELETE
FROM
	user_mst
WHERE
	user_code = 4;