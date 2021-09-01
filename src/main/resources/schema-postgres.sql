CREATE TABLE IF NOT EXISTS cars_data(

   id bigserial PRIMARY KEY,
   plate_number VARCHAR(100) NOT NULL,
   series_number_document VARCHAR(100) NOT NULL

);

CREATE TABLE IF NOT EXISTS fines(

          id bigserial PRIMARY KEY,
          car_data_id serial NOT NULL,--id данных по авто
          date_of_violation TIMESTAMP NOT NULL,--дата штрафа
          type_of_violation VARCHAR(5000)  NOT NULL,--тип праванарушения
          decree_number VARCHAR(60) NOT NULL, -- номер постановления
          amount_of_the_fine  DECIMAL(13,2) NOT NULL,--сумма штрафа
          payment BOOLEAN NOT NULL,--оплата boolean
          image BYTEA NOT NULL
);