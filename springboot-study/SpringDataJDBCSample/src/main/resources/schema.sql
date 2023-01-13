-- 存在しない場合のみテーブルを定義
CREATE TABLE IF NOT EXISTS member (
    id SERIAL NOT NULL PRIMARY KEY,
    name TEXT
);