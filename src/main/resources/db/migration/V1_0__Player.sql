-- Table Player
CREATE TABLE IF NOT EXISTS public.player (
  id BIGSERIAL NOT NULL,
  name varchar(255) NOT NULL,
  PRIMARY KEY(id)
);