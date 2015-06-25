
INSERT INTO academic_year (id, active, end_year, monitoring_end, monitoring_start, payment_period, registration_end, registration_start, remark, start_year) VALUES (1, true, 2016, '2015-12-31 00:00:00', '2015-07-01 00:00:00', false, '2015-12-31 00:00:00', '2015-07-01 00:00:00', '2015 - 2016', 2015);


INSERT INTO address_status (id, name, name_eng) VALUES ('other', 'Lain-lain', 'Other');
INSERT INTO address_status (id, name, name_eng) VALUES ('parents-house', 'Rumah Orang Tua', 'Parents House');
INSERT INTO address_status (id, name, name_eng) VALUES ('relatives-house', 'Rumah Saudara', 'Relatives House');
INSERT INTO address_status (id, name, name_eng) VALUES ('rented-house', 'Rumah Kontrak', 'Rented House');
INSERT INTO address_status (id, name, name_eng) VALUES ('boarding-house', 'Rumah Kost', 'Boarding House');
INSERT INTO address_status (id, name, name_eng) VALUES ('dormitory', 'Asrama', 'Dormitory');
INSERT INTO address_status (id, name, name_eng) VALUES ('guardian-house', 'Rumah Wali', 'Guardian House');


INSERT INTO discipline (id, name, name_eng) VALUES ('lain-lain', 'Others', 'Lain-lain');
INSERT INTO discipline (id, name, name_eng) VALUES ('accounting', 'Accounting', 'Accounting');
INSERT INTO discipline (id, name, name_eng) VALUES ('administration', 'Administration', 'Administration');
INSERT INTO discipline (id, name, name_eng) VALUES ('agriculture', 'Agriculture', 'Agriculture');
INSERT INTO discipline (id, name, name_eng) VALUES ('animal-husbandry', 'Animal Husbandry', 'Animal Husbandry');
INSERT INTO discipline (id, name, name_eng) VALUES ('anthropology', 'Anthropology', 'Anthropology');
INSERT INTO discipline (id, name, name_eng) VALUES ('architecture', 'Architecture', 'Architecture');
INSERT INTO discipline (id, name, name_eng) VALUES ('arts-and-cultures', 'Arts and Cultures', 'Arts and Cultures');
INSERT INTO discipline (id, name, name_eng) VALUES ('arts-and-design', 'Arts and Design', 'Arts and Design');
INSERT INTO discipline (id, name, name_eng) VALUES ('biology', 'Biology', 'Biology');
INSERT INTO discipline (id, name, name_eng) VALUES ('business-administration', 'Business Administration', 'Business Administration');
INSERT INTO discipline (id, name, name_eng) VALUES ('chemistry', 'Chemistry', 'Chemistry');
INSERT INTO discipline (id, name, name_eng) VALUES ('communication', 'Communication', 'Communication');
INSERT INTO discipline (id, name, name_eng) VALUES ('computer-science', 'Computer Science', 'Computer Science');
INSERT INTO discipline (id, name, name_eng) VALUES ('dentistry', 'Dentistry', 'Dentistry');
INSERT INTO discipline (id, name, name_eng) VALUES ('economics-and-business', 'Economics and Business', 'Economics and Business');
INSERT INTO discipline (id, name, name_eng) VALUES ('education', 'Education', 'Education');
INSERT INTO discipline (id, name, name_eng) VALUES ('engineering', 'Engineering', 'Engineering');
INSERT INTO discipline (id, name, name_eng) VALUES ('english', 'English', 'English');
INSERT INTO discipline (id, name, name_eng) VALUES ('financial-management', 'Financial management', 'Financial management');
INSERT INTO discipline (id, name, name_eng) VALUES ('fishery-and-marine-science', 'Fishery and Marine Science', 'Fishery and Marine Science');
INSERT INTO discipline (id, name, name_eng) VALUES ('forestry', 'Forestry', 'Forestry');
INSERT INTO discipline (id, name, name_eng) VALUES ('geography', 'Geography', 'Geography');
INSERT INTO discipline (id, name, name_eng) VALUES ('history', 'History', 'History');
INSERT INTO discipline (id, name, name_eng) VALUES ('informatics', 'Informatics', 'Informatics');
INSERT INTO discipline (id, name, name_eng) VALUES ('information-technology-ict', 'Information Technology/ICT', 'Information Technology/ICT');
INSERT INTO discipline (id, name, name_eng) VALUES ('literature', 'Literature', 'Literature');
INSERT INTO discipline (id, name, name_eng) VALUES ('management', 'Management', 'Management');
INSERT INTO discipline (id, name, name_eng) VALUES ('mathematics', 'Mathematics', 'Mathematics');
INSERT INTO discipline (id, name, name_eng) VALUES ('medicine', 'Medicine', 'Medicine');
INSERT INTO discipline (id, name, name_eng) VALUES ('midwifery', 'Midwifery', 'Midwifery');
INSERT INTO discipline (id, name, name_eng) VALUES ('nursery', 'Nursery', 'Nursery');
INSERT INTO discipline (id, name, name_eng) VALUES ('pharmacy', 'Pharmacy', 'Pharmacy');
INSERT INTO discipline (id, name, name_eng) VALUES ('physics', 'Physics', 'Physics');
INSERT INTO discipline (id, name, name_eng) VALUES ('psychology', 'Psychology', 'Psychology');
INSERT INTO discipline (id, name, name_eng) VALUES ('public-health', 'Public Health', 'Public Health');
INSERT INTO discipline (id, name, name_eng) VALUES ('social-welfare', 'Social Welfare', 'Social Welfare');
INSERT INTO discipline (id, name, name_eng) VALUES ('sociology', 'Sociology', 'Sociology');
INSERT INTO discipline (id, name, name_eng) VALUES ('statistics', 'Statistics', 'Statistics');
INSERT INTO discipline (id, name, name_eng) VALUES ('technical-technology', 'Technical/Technology', 'Technical/Technology');
INSERT INTO discipline (id, name, name_eng) VALUES ('tourism', 'Tourism', 'Tourism');


INSERT INTO education_level (id, name, name_eng) VALUES ('others', 'Lain-lain', 'Others');
INSERT INTO education_level (id, name, name_eng) VALUES ('sd', 'SD', 'SD');
INSERT INTO education_level (id, name, name_eng) VALUES ('smp', 'SMP', 'SMP');
INSERT INTO education_level (id, name, name_eng) VALUES ('sma', 'SMA', 'SMA');
INSERT INTO education_level (id, name, name_eng) VALUES ('d1', 'D1', 'D1');
INSERT INTO education_level (id, name, name_eng) VALUES ('d2', 'D2', 'D2');
INSERT INTO education_level (id, name, name_eng) VALUES ('d3', 'D3', 'D3');
INSERT INTO education_level (id, name, name_eng) VALUES ('s1', 'S1', 'S1');
INSERT INTO education_level (id, name, name_eng) VALUES ('s2', 'S2', 'S2');
INSERT INTO education_level (id, name, name_eng) VALUES ('s3', 'S3', 'S3');
INSERT INTO education_level (id, name, name_eng) VALUES ('informal-education-courses', 'Pendidikan Informal/Kursus', 'Informal Education/Courses');


INSERT INTO fund_source (id, name, name_eng) VALUES ('other', 'Lain-lain', 'Other');
INSERT INTO fund_source (id, name, name_eng) VALUES ('parents', 'Orang Tua', 'Parents');
INSERT INTO fund_source (id, name, name_eng) VALUES ('guardian', 'Wali', 'Guardian');
INSERT INTO fund_source (id, name, name_eng) VALUES ('self', 'Sendiri', 'Self');


SELECT pg_catalog.setval('hibernate_sequence', 1, true);


INSERT INTO income_range (id, description, start, util) VALUES ('0to500.000', '< 500.000', 0, 500000);
INSERT INTO income_range (id, description, start, util) VALUES ('500.000to1.000.000', '500.000 - 1.000.000', 500000, 1000000);
INSERT INTO income_range (id, description, start, util) VALUES ('1.000.000to2.000.000', '1.000.000 - 2.000.000', 1000000, 2000000);
INSERT INTO income_range (id, description, start, util) VALUES ('2.000.000to3.000.000', '2.000.000 - 3.000.000', 2000000, 3000000);
INSERT INTO income_range (id, description, start, util) VALUES ('3.000.000to4.000.000', '3.000.000 - 4.000.000', 3000000, 4000000);
INSERT INTO income_range (id, description, start, util) VALUES ('4.000.000to5.000.000', '4.000.000 - 5.000.000', 4000000, 5000000);
INSERT INTO income_range (id, description, start, util) VALUES ('5.000.000to6.000.000', '5.000.000 - 6.000.000', 5000000, 6000000);
INSERT INTO income_range (id, description, start, util) VALUES ('6.000.000to7.000.000', '6.000.000 - 7.000.000', 6000000, 7000000);
INSERT INTO income_range (id, description, start, util) VALUES ('7.000.000toInfinite', '> 7.000.000', 7000000, 2147483647);


INSERT INTO province (id, name) VALUES ('aceh', 'Aceh');
INSERT INTO province (id, name) VALUES ('sumatera-utara', 'Sumatera Utara');
INSERT INTO province (id, name) VALUES ('sumatera-barat', 'Sumatera Barat');
INSERT INTO province (id, name) VALUES ('riau', 'Riau');
INSERT INTO province (id, name) VALUES ('kepulauan-riau', 'Kepulauan Riau');
INSERT INTO province (id, name) VALUES ('jambi', 'Jambi');
INSERT INTO province (id, name) VALUES ('sumatera-selatan', 'Sumatera Selatan');
INSERT INTO province (id, name) VALUES ('bangka-belitung', 'Bangka Belitung');
INSERT INTO province (id, name) VALUES ('bengkulu', 'Bengkulu');
INSERT INTO province (id, name) VALUES ('lampung', 'Lampung');
INSERT INTO province (id, name) VALUES ('dki-jakarta', 'DKI Jakarta');
INSERT INTO province (id, name) VALUES ('jawa-barat', 'Jawa Barat');
INSERT INTO province (id, name) VALUES ('banten', 'Banten');
INSERT INTO province (id, name) VALUES ('jawa-tengah', 'Jawa Tengah');
INSERT INTO province (id, name) VALUES ('d-i-yogyakarta', 'D.I. Yogyakarta');
INSERT INTO province (id, name) VALUES ('jawa-timur', 'Jawa Timur');
INSERT INTO province (id, name) VALUES ('bali', 'Bali');
INSERT INTO province (id, name) VALUES ('nusa-tenggara-barat', 'Nusa Tenggara Barat');
INSERT INTO province (id, name) VALUES ('nusa-tenggara-timur', 'Nusa Tenggara Timur');
INSERT INTO province (id, name) VALUES ('kalimantan-utara', 'Kalimantan Utara');
INSERT INTO province (id, name) VALUES ('kalimantan-barat', 'Kalimantan Barat');
INSERT INTO province (id, name) VALUES ('kalimantan-tengah', 'Kalimantan Tengah');
INSERT INTO province (id, name) VALUES ('kalimantan-selatan', 'Kalimantan Selatan');
INSERT INTO province (id, name) VALUES ('kalimantan-timur', 'Kalimantan Timur');
INSERT INTO province (id, name) VALUES ('sulawesi-utara', 'Sulawesi Utara');
INSERT INTO province (id, name) VALUES ('sulawesi-barat', 'Sulawesi Barat');
INSERT INTO province (id, name) VALUES ('sulawesi-tengah', 'Sulawesi Tengah');
INSERT INTO province (id, name) VALUES ('sulawesi-tenggara', 'Sulawesi Tenggara');
INSERT INTO province (id, name) VALUES ('sulawesi-selatan', 'Sulawesi Selatan');
INSERT INTO province (id, name) VALUES ('gorontalo', 'Gorontalo');
INSERT INTO province (id, name) VALUES ('maluku', 'Maluku');
INSERT INTO province (id, name) VALUES ('maluku-utara', 'Maluku Utara');
INSERT INTO province (id, name) VALUES ('papua-barat', 'Papua Barat');
INSERT INTO province (id, name) VALUES ('papua', 'Papua');


INSERT INTO institution (id, active, address, name, name_eng, website, province) VALUES ('UNAIR', true, '', 'Airlangga University, Surabaya', 'Airlangga University, Surabaya', '', 'jawa-timur');
INSERT INTO institution (id, active, address, name, name_eng, website, province) VALUES ('ALFATH', true, '', 'Al Fathonah Midwifery Academy, Jakarta', 'Al Fathonah Midwifery Academy, Jakarta', '', 'dki-jakarta');
INSERT INTO institution (id, active, address, name, name_eng, website, province) VALUES ('ANDARA', true, '', 'Andakara Nursery Academy, Jakarta', 'Andakara Nursery Academy, Jakarta', '', 'dki-jakarta');
INSERT INTO institution (id, active, address, name, name_eng, website, province) VALUES ('UNAND', true, '', 'Andalas University, Padang', 'Andalas University, Padang', '', 'sumatera-barat');
INSERT INTO institution (id, active, address, name, name_eng, website, province) VALUES ('UKAW', true, '', 'Artha Wacana Christian University, Kupang', 'Artha Wacana Christian University, Kupang', '', 'nusa-tenggara-timur');
INSERT INTO institution (id, active, address, name, name_eng, website, province) VALUES ('UAJM', true, '', 'Atma Jaya Makassar University, Makassar', 'Atma Jaya Makassar University, Makassar', '', 'sulawesi-selatan');
INSERT INTO institution (id, active, address, name, name_eng, website, province) VALUES ('UBH', true, '', 'Bung Hatta University, Padang', 'Bung Hatta University, Padang', '', 'sumatera-barat');
INSERT INTO institution (id, active, address, name, name_eng, website, province) VALUES ('USALLE', true, '', 'De La Salle University of Manado, Manado', 'De La Salle University of Manado, Manado', '', 'sulawesi-utara');
INSERT INTO institution (id, active, address, name, name_eng, website, province) VALUES ('UNHAS', true, '', 'Hasanuddin University, Makassar', 'Hasanuddin University, Makassar', '', 'sulawesi-selatan');
INSERT INTO institution (id, active, address, name, name_eng, website, province) VALUES ('IPB', true, '', 'Bogor Agricultural University, Bogor', 'Bogor Agricultural University, Bogor', '', 'jawa-barat');
INSERT INTO institution (id, active, address, name, name_eng, website, province) VALUES ('ITB', true, '', 'Bandung Institute of Technology', 'Bandung Institute of Technology', '', 'jawa-barat');
INSERT INTO institution (id, active, address, name, name_eng, website, province) VALUES ('ITS', true, '', 'Sepuluh Nopember Institute ot Technology', 'Sepuluh Nopember Institute ot Technology', '', 'jawa-timur');
INSERT INTO institution (id, active, address, name, name_eng, website, province) VALUES ('UMACH', true, '', 'Ma Chung University, Malang', 'Ma Chung University, Malang', '', 'jawa-timur');
INSERT INTO institution (id, active, address, name, name_eng, website, province) VALUES ('UNPAD', true, '', 'Padjadjaran University, Bandung', 'Padjadjaran University, Bandung', '', 'jawa-barat');
INSERT INTO institution (id, active, address, name, name_eng, website, province) VALUES ('UNPATI', true, '', 'Pattimura University, Ambon', 'Pattimura University, Ambon', '', 'maluku');
INSERT INTO institution (id, active, address, name, name_eng, website, province) VALUES ('UPETRA', true, '', 'Petra Christian University, Surabaya', 'Petra Christian University, Surabaya', '', 'jawa-timur');
INSERT INTO institution (id, active, address, name, name_eng, website, province) VALUES ('STIKOM', true, '', 'Universitas Uyelindo ,Kupang', 'Universitas Uyelindo ,Kupang', '', 'nusa-tenggara-timur');
INSERT INTO institution (id, active, address, name, name_eng, website, province) VALUES ('STMUSI', true, '', 'Sekolah Tinggi MUSI, Palembang', 'Sekolah Tinggi MUSI, Palembang', '', 'sumatera-selatan');
INSERT INTO institution (id, active, address, name, name_eng, website, province) VALUES ('UNTAN', true, '', 'Tanjungpura University, Pontianak', 'Tanjungpura University, Pontianak', '', 'kalimantan-barat');
INSERT INTO institution (id, active, address, name, name_eng, website, province) VALUES ('UKDW', true, '', 'Duta Wacana Christian University, Yogyakarta', 'Duta Wacana Christian University, Yogyakarta', '', 'd-i-yogyakarta');
INSERT INTO institution (id, active, address, name, name_eng, website, province) VALUES ('UKIM', true, '', 'Christian University of Indonesia in Maluku, Ambon', 'Christian University of Indonesia in Maluku, Ambon', '', 'maluku');
INSERT INTO institution (id, active, address, name, name_eng, website, province) VALUES ('UKSW', true, '', 'Satya Wacana Christian University, Salatiga', 'Satya Wacana Christian University, Salatiga', '', 'jawa-tengah');
INSERT INTO institution (id, active, address, name, name_eng, website, province) VALUES ('UNDANA', true, '', 'Nusa Cendana University, Kupang', 'Nusa Cendana University, Kupang', '', 'nusa-tenggara-timur');
INSERT INTO institution (id, active, address, name, name_eng, website, province) VALUES ('USOEGI', true, '', 'Soegijapranata Catholic University, Semarang', 'Soegijapranata Catholic University, Semarang', '', 'jawa-tengah');
INSERT INTO institution (id, active, address, name, name_eng, website, province) VALUES ('UNIMED', true, '', 'State University of Medan, Medan', 'State University of Medan, Medan', '', 'sumatera-utara');
INSERT INTO institution (id, active, address, name, name_eng, website, province) VALUES ('UGM', true, '', 'Gadjah Mada University, Yogyakarta', 'Gadjah Mada University, Yogyakarta', '', 'd-i-yogyakarta');
INSERT INTO institution (id, active, address, name, name_eng, website, province) VALUES ('UHANTU', true, '', 'Hang Tuah University, Surabaya', 'Hang Tuah University, Surabaya', '', 'jawa-timur');
INSERT INTO institution (id, active, address, name, name_eng, website, province) VALUES ('UNP', true, '', 'State University of Padang , Padang', 'State University of Padang , Padang', '', 'sumatera-barat');
INSERT INTO institution (id, active, address, name, name_eng, website, province) VALUES ('UNLAM', true, '', 'Lambung Mangkurat University, Banjarmasin', 'Lambung Mangkurat University, Banjarmasin', '', 'kalimantan-selatan');
INSERT INTO institution (id, active, address, name, name_eng, website, province) VALUES ('UNNES', true, '', 'State University of Semarang, Semarang', 'State University of Semarang, Semarang', '', 'jawa-tengah');
INSERT INTO institution (id, active, address, name, name_eng, website, province) VALUES ('UNSRAT', true, '', 'Sam Ratulangi University, Manado', 'Sam Ratulangi University, Manado', '', 'sulawesi-utara');
INSERT INTO institution (id, active, address, name, name_eng, website, province) VALUES ('USD', true, '', 'Sanata Dharma University, Yogyakarta', 'Sanata Dharma University, Yogyakarta', '', 'd-i-yogyakarta');
INSERT INTO institution (id, active, address, name, name_eng, website, province) VALUES ('UNWIRA', true, '', 'Widya Mandira Catholic University, Kupang', 'Widya Mandira Catholic University, Kupang', '', 'nusa-tenggara-timur');
INSERT INTO institution (id, active, address, name, name_eng, website, province) VALUES ('UWKS', true, '', 'Wijaya Kusuma Surabaya University, Surabaya', 'Wijaya Kusuma Surabaya University, Surabaya', '', 'jawa-timur');
INSERT INTO institution (id, active, address, name, name_eng, website, province) VALUES ('USU', true, '', 'University of Sumatera Utara, Medan', 'University of Sumatera Utara, Medan', '', 'sumatera-utara');
INSERT INTO institution (id, active, address, name, name_eng, website, province) VALUES ('OTHER', true, '', 'Other University/University Not Listed', 'Other University/University Not Listed', '', 'd-i-yogyakarta');
INSERT INTO institution (id, active, address, name, name_eng, website, province) VALUES ('REGPAC', true, '', 'SMAK Regina Pacis, Bajawa', 'SMAK Regina Pacis, Bajawa', '', 'nusa-tenggara-timur');
INSERT INTO institution (id, active, address, name, name_eng, website, province) VALUES ('RvG', true, '', 'RVG, Yogyakarta', 'RVG, Yogyakarta', '', 'd-i-yogyakarta');


INSERT INTO occupation (id, name, name_eng) VALUES ('others', 'Lain-lain', 'Others');
INSERT INTO occupation (id, name, name_eng) VALUES ('labor', 'Buruh', 'Labor');
INSERT INTO occupation (id, name, name_eng) VALUES ('doctor-nurse', 'Dokter/Perawat', 'Doctor/Nurse');
INSERT INTO occupation (id, name, name_eng) VALUES ('teacher-lecturer', 'Guru/Dosen', 'Teacher/Lecturer');
INSERT INTO occupation (id, name, name_eng) VALUES ('employee', 'Karyawan Swasta', 'Employee');
INSERT INTO occupation (id, name, name_eng) VALUES ('farmer', 'Petani/Pekebun', 'Farmer');
INSERT INTO occupation (id, name, name_eng) VALUES ('pns', 'PNS', 'PNS');
INSERT INTO occupation (id, name, name_eng) VALUES ('tni-polri', 'TNI/POLRI', 'TNI/POLRI');
INSERT INTO occupation (id, name, name_eng) VALUES ('entrepreneur-self-employed', 'Wiraswasta', 'Entrepreneur/Self-employed');
INSERT INTO occupation (id, name, name_eng) VALUES ('unemployed', 'Tidak Bekerja', 'Unemployed');
INSERT INTO occupation (id, name, name_eng) VALUES ('bumn', 'BUMN', 'BUMN');


INSERT INTO working_status (id, name, name_eng) VALUES ('no', 'Tidak', 'Tidak');
INSERT INTO working_status (id, name, name_eng) VALUES ('yes', 'Ya', 'Ya');
INSERT INTO working_status (id, name, name_eng) VALUES ('part-time', 'Paruh Waktu', 'Paruh Waktu');



