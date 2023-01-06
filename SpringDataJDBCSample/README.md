# SpringDataJDBCSample
`SpringBoot`からDB(`PostgreSQL`)を操作するサンプル。

## PostgreSQLの用意
以下を利用。

mochizuki875/postgresql-docker-compose
https://github.com/mochizuki875/postgresql-docker-compose

## SQLスキーマの利用
スキーマを利用してテーブルを自動作成するようにしている。

`application.properties`
```
...
spring.sql.init.mode=always
```

`schema.sql`
```
-- 存在しない場合のみテーブルを定義
CREATE TABLE IF NOT EXISTS member (
    id SERIAL NOT NULL PRIMARY KEY,
    name TEXT
);
```

参考
SpringBootのDB初期化方法
https://qiita.com/thankkingdom/items/f2620c7a13450de50d5d