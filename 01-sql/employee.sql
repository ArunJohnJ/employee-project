CREATE TABLE IF NOT EXISTS `mydb`.`table1` (
  `id` BIGINT NOT NULL,
  `first_name` VARCHAR(45) NULL,
  `last_name` VARCHAR(45) NULL,
  `role` VARCHAR(45) NULL,
  `computer_access` VARCHAR(20) NULL,
  `Internet_access` VARCHAR(20) NULL,
  `branch_name` VARCHAR(45) NULL,
  `headset` TINYINT NULL,
  `work_from_home` TINYINT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB