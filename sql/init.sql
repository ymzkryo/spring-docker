CREATE TABLE `todo_items` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `title` varchar(10) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `done_flag` tinyint(1) DEFAULT NULL,
  `time_limit` date DEFAULT NULL,
  KEY `id` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci
