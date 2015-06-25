package org.vdms.scholarship.db.util

import java.time.{LocalDate, Month}

import org.vdms.scholarship.db.entity._

/**
 * Created by Deny Prasetyo
 * 25 June 2015
 * Principal Software Development Engineer
 * GDP Labs
 * deny.prasetyo@gdplabs.id
 */


object SeedData {

  import org.vdms.scholarship.util.text.StringSlugUtil._

  val academicYearList = List(
    AcademicYear(2015, 2016, "2015 - 2016", paymentPeriod = false, LocalDate.of(2015, Month.JULY, 1), LocalDate.of(2015, Month.DECEMBER, 31), LocalDate.of(2015, Month.JULY, 1), LocalDate.of(2015, Month.DECEMBER, 31), active = true)
  )

  val addressStatusList = List(
    AddressStatus("Other".toSlug, "Lain-lain", "Other"),
    AddressStatus("Parents House".toSlug, "Rumah Orang Tua", "Parents House"),
    AddressStatus("Relatives House".toSlug, "Rumah Saudara", "Relatives House"),
    AddressStatus("Rented House".toSlug, "Rumah Kontrak", "Rented House"),
    AddressStatus("Boarding House".toSlug, "Rumah Kost", "Boarding House"),
    AddressStatus("Dormitory".toSlug, "Asrama", "Dormitory"),
    AddressStatus("Guardian House".toSlug, "Rumah Wali", "Guardian House")
  )


  val disciplineList = List(
    Discipline("Lain-lain".toSlug, "Others", "Lain-lain"),
    Discipline("Accounting".toSlug, "Accounting", "Accounting"),
    Discipline("Administration".toSlug, "Administration", "Administration"),
    Discipline("Agriculture".toSlug, "Agriculture", "Agriculture"),
    Discipline("Animal Husbandry".toSlug, "Animal Husbandry", "Animal Husbandry"),
    Discipline("Anthropology".toSlug, "Anthropology", "Anthropology"),
    Discipline("Architecture".toSlug, "Architecture", "Architecture"),
    Discipline("Arts and Cultures".toSlug, "Arts and Cultures", "Arts and Cultures"),
    Discipline("Arts and Design".toSlug, "Arts and Design", "Arts and Design"),
    Discipline("Biology".toSlug, "Biology", "Biology"),
    Discipline("Business Administration".toSlug, "Business Administration", "Business Administration"),
    Discipline("Chemistry".toSlug, "Chemistry", "Chemistry"),
    Discipline("Communication".toSlug, "Communication", "Communication"),
    Discipline("Computer Science".toSlug, "Computer Science", "Computer Science"),
    Discipline("Dentistry".toSlug, "Dentistry", "Dentistry"),
    Discipline("Economics and Business".toSlug, "Economics and Business", "Economics and Business"),
    Discipline("Education".toSlug, "Education", "Education"),
    Discipline("Engineering".toSlug, "Engineering", "Engineering"),
    Discipline("English".toSlug, "English", "English"),
    Discipline("Financial management".toSlug, "Financial management", "Financial management"),
    Discipline("Fishery and Marine Science".toSlug, "Fishery and Marine Science", "Fishery and Marine Science"),
    Discipline("Forestry".toSlug, "Forestry", "Forestry"),
    Discipline("Geography".toSlug, "Geography", "Geography"),
    Discipline("History".toSlug, "History", "History"),
    Discipline("Informatics".toSlug, "Informatics", "Informatics"),
    Discipline("Information Technology/ICT".toSlug, "Information Technology/ICT", "Information Technology/ICT"),
    Discipline("Literature".toSlug, "Literature", "Literature"),
    Discipline("Management".toSlug, "Management", "Management"),
    Discipline("Mathematics".toSlug, "Mathematics", "Mathematics"),
    Discipline("Medicine".toSlug, "Medicine", "Medicine"),
    Discipline("Midwifery".toSlug, "Midwifery", "Midwifery"),
    Discipline("Nursery".toSlug, "Nursery", "Nursery"),
    Discipline("Pharmacy".toSlug, "Pharmacy", "Pharmacy"),
    Discipline("Physics".toSlug, "Physics", "Physics"),
    Discipline("Psychology".toSlug, "Psychology", "Psychology"),
    Discipline("Public Health".toSlug, "Public Health", "Public Health"),
    Discipline("Social Welfare".toSlug, "Social Welfare", "Social Welfare"),
    Discipline("Sociology".toSlug, "Sociology", "Sociology"),
    Discipline("Statistics".toSlug, "Statistics", "Statistics"),
    Discipline("Technical/Technology".toSlug, "Technical/Technology", "Technical/Technology"),
    Discipline("Tourism".toSlug, "Tourism", "Tourism")
  )

  val educationLevelList = List(
    EducationLevel("Others".toSlug, "Lain-lain", "Others"),
    EducationLevel("SD".toSlug, "SD", "SD"),
    EducationLevel("SMP".toSlug, "SMP", "SMP"),
    EducationLevel("SMA".toSlug, "SMA", "SMA"),
    EducationLevel("D1".toSlug, "D1", "D1"),
    EducationLevel("D2".toSlug, "D2", "D2"),
    EducationLevel("D3".toSlug, "D3", "D3"),
    EducationLevel("S1".toSlug, "S1", "S1"),
    EducationLevel("S2".toSlug, "S2", "S2"),
    EducationLevel("S3".toSlug, "S3", "S3"),
    EducationLevel("Informal Education/Courses".toSlug, "Pendidikan Informal/Kursus", "Informal Education/Courses")
  )


  val incomeRangeList = List(
    IncomeRange("0to500.000", "< 500.000", 0, 500000),
    IncomeRange("500.000to1.000.000", "500.000 - 1.000.000", 500000, 1000000),
    IncomeRange("1.000.000to2.000.000", "1.000.000 - 2.000.000", 1000000, 2000000),
    IncomeRange("2.000.000to3.000.000", "2.000.000 - 3.000.000", 2000000, 3000000),
    IncomeRange("3.000.000to4.000.000", "3.000.000 - 4.000.000", 3000000, 4000000),
    IncomeRange("4.000.000to5.000.000", "4.000.000 - 5.000.000", 4000000, 5000000),
    IncomeRange("5.000.000to6.000.000", "5.000.000 - 6.000.000", 5000000, 6000000),
    IncomeRange("6.000.000to7.000.000", "6.000.000 - 7.000.000", 6000000, 7000000),
    IncomeRange("7.000.000toInfinite", "> 7.000.000", 7000000)
  )


  val provinceList = List(
    Province("Aceh".toSlug, "Aceh"),
    Province("Sumatera Utara".toSlug, "Sumatera Utara"),
    Province("Sumatera Barat".toSlug, "Sumatera Barat"),
    Province("Riau".toSlug, "Riau"),
    Province("Kepulauan Riau".toSlug, "Kepulauan Riau"),
    Province("Jambi".toSlug, "Jambi"),
    Province("Sumatera Selatan".toSlug, "Sumatera Selatan"),
    Province("Bangka Belitung".toSlug, "Bangka Belitung"),
    Province("Bengkulu".toSlug, "Bengkulu"),
    Province("Lampung".toSlug, "Lampung"),
    Province("DKI Jakarta".toSlug, "DKI Jakarta"),
    Province("Jawa Barat".toSlug, "Jawa Barat"),
    Province("Banten".toSlug, "Banten"),
    Province("Jawa Tengah".toSlug, "Jawa Tengah"),
    Province("D.I. Yogyakarta".toSlug, "D.I. Yogyakarta"),
    Province("Jawa Timur".toSlug, "Jawa Timur"),
    Province("Bali".toSlug, "Bali"),
    Province("Nusa Tenggara Barat".toSlug, "Nusa Tenggara Barat"),
    Province("Nusa Tenggara Timur".toSlug, "Nusa Tenggara Timur"),
    Province("Kalimantan Utara".toSlug, "Kalimantan Utara"),
    Province("Kalimantan Barat".toSlug, "Kalimantan Barat"),
    Province("Kalimantan Tengah".toSlug, "Kalimantan Tengah"),
    Province("Kalimantan Selatan".toSlug, "Kalimantan Selatan"),
    Province("Kalimantan Timur".toSlug, "Kalimantan Timur"),
    Province("Sulawesi Utara".toSlug, "Sulawesi Utara"),
    Province("Sulawesi Barat".toSlug, "Sulawesi Barat"),
    Province("Sulawesi Tengah".toSlug, "Sulawesi Tengah"),
    Province("Sulawesi Tenggara".toSlug, "Sulawesi Tenggara"),
    Province("Sulawesi Selatan".toSlug, "Sulawesi Selatan"),
    Province("Gorontalo".toSlug, "Gorontalo"),
    Province("Maluku".toSlug, "Maluku"),
    Province("Maluku Utara".toSlug, "Maluku Utara"),
    Province("Papua Barat".toSlug, "Papua Barat"),
    Province("Papua".toSlug, "Papua")
  )


  val fundSourceList = List(
    FundSource("Other".toSlug, "Lain-lain", "Other"),
    FundSource("Parents".toSlug, "Orang Tua", "Parents"),
    FundSource("Guardian".toSlug, "Wali", "Guardian"),
    FundSource("Self".toSlug, "Sendiri", "Self")
  )


  val workingStatusList = List(
    WorkingStatus("No".toSlug, "Tidak", "No"),
    WorkingStatus("Yes".toSlug, "Ya", "Yes"),
    WorkingStatus("Part Time".toSlug, "Paruh Waktu", "Part Time")
  )


  val occupationList = List(
    Occupation("Others".toSlug, "Lain-lain", "Others"),
    Occupation("Labor".toSlug, "Buruh", "Labor"),
    Occupation("Doctor/Nurse".toSlug, "Dokter/Perawat", "Doctor/Nurse"),
    Occupation("Teacher/Lecturer".toSlug, "Guru/Dosen", "Teacher/Lecturer"),
    Occupation("Employee".toSlug, "Karyawan Swasta", "Employee"),
    Occupation("Farmer".toSlug, "Petani/Pekebun", "Farmer"),
    Occupation("PNS".toSlug, "PNS", "PNS"),
    Occupation("TNI/POLRI".toSlug, "TNI/POLRI", "TNI/POLRI"),
    Occupation("Entrepreneur/Self-employed".toSlug, "Wiraswasta", "Entrepreneur/Self-employed"),
    Occupation("Unemployed".toSlug, "Tidak Bekerja", "Unemployed"),
    Occupation("BUMN".toSlug, "BUMN", "BUMN")
  )


  val institutionList = List(
    Institution(id = "UNAIR", name = "Airlangga University, Surabaya", nameEng = "Airlangga University, Surabaya", province = Province("Jawa Timur".toSlug), address = "", website = "", active = true),
    Institution(id = "ALFATH", name = "Al Fathonah Midwifery Academy, Jakarta", nameEng = "Al Fathonah Midwifery Academy, Jakarta", province = Province("DKI Jakarta".toSlug), address = "", website = "", active = true),
    Institution(id = "ANDARA", name = "Andakara Nursery Academy, Jakarta", nameEng = "Andakara Nursery Academy, Jakarta", province = Province("DKI Jakarta".toSlug), address = "", website = "", active = true),
    Institution(id = "UNAND", name = "Andalas University, Padang", nameEng = "Andalas University, Padang", province = Province("Sumatera Barat".toSlug), address = "", website = "", active = true),
    Institution(id = "UKAW", name = "Artha Wacana Christian University, Kupang", nameEng = "Artha Wacana Christian University, Kupang", province = Province("Nusa Tenggara Timur".toSlug), address = "", website = "", active = true),
    Institution(id = "UAJM", name = "Atma Jaya Makassar University, Makassar", nameEng = "Atma Jaya Makassar University, Makassar", province = Province("Sulawesi Selatan".toSlug), address = "", website = "", active = true),
    Institution(id = "UBH", name = "Bung Hatta University, Padang", nameEng = "Bung Hatta University, Padang", province = Province("Sumatera Barat".toSlug), address = "", website = "", active = true),
    Institution(id = "USALLE", name = "De La Salle University of Manado, Manado", nameEng = "De La Salle University of Manado, Manado", province = Province("Sulawesi Utara".toSlug), address = "", website = "", active = true),
    Institution(id = "UNHAS", name = "Hasanuddin University, Makassar", nameEng = "Hasanuddin University, Makassar", province = Province("Sulawesi Selatan".toSlug), address = "", website = "", active = true),
    Institution(id = "IPB", name = "Bogor Agricultural University, Bogor", nameEng = "Bogor Agricultural University, Bogor", province = Province("Jawa Barat".toSlug), address = "", website = "", active = true),
    Institution(id = "ITB", name = "Bandung Institute of Technology", nameEng = "Bandung Institute of Technology", province = Province("Jawa Barat".toSlug), address = "", website = "", active = true),
    Institution(id = "ITS", name = "Sepuluh Nopember Institute ot Technology", nameEng = "Sepuluh Nopember Institute ot Technology", province = Province("Jawa Timur".toSlug), address = "", website = "", active = true),
    Institution(id = "UMACH", name = "Ma Chung University, Malang", nameEng = "Ma Chung University, Malang", province = Province("Jawa Timur".toSlug), address = "", website = "", active = true),
    Institution(id = "UNPAD", name = "Padjadjaran University, Bandung", nameEng = "Padjadjaran University, Bandung", province = Province("Jawa Barat".toSlug), address = "", website = "", active = true),
    Institution(id = "UNPATI", name = "Pattimura University, Ambon", nameEng = "Pattimura University, Ambon", province = Province("Maluku".toSlug), address = "", website = "", active = true),
    Institution(id = "UPETRA", name = "Petra Christian University, Surabaya", nameEng = "Petra Christian University, Surabaya", province = Province("Jawa Timur".toSlug), address = "", website = "", active = true),
    Institution(id = "STIKOM", name = "Universitas Uyelindo ,Kupang", nameEng = "Universitas Uyelindo ,Kupang", province = Province("Nusa Tenggara Timur".toSlug), address = "", website = "", active = true),
    Institution(id = "STMUSI", name = "Sekolah Tinggi MUSI, Palembang", nameEng = "Sekolah Tinggi MUSI, Palembang", province = Province("Sumatera Selatan".toSlug), address = "", website = "", active = true),
    Institution(id = "UNTAN", name = "Tanjungpura University, Pontianak", nameEng = "Tanjungpura University, Pontianak", province = Province("Kalimantan Barat".toSlug), address = "", website = "", active = true),
    Institution(id = "UKDW", name = "Duta Wacana Christian University, Yogyakarta", nameEng = "Duta Wacana Christian University, Yogyakarta", province = Province("D.I. Yogyakarta".toSlug), address = "", website = "", active = true),
    Institution(id = "UKIM", name = "Christian University of Indonesia in Maluku, Ambon", nameEng = "Christian University of Indonesia in Maluku, Ambon", province = Province("Maluku".toSlug), address = "", website = "", active = true),
    Institution(id = "UKSW", name = "Satya Wacana Christian University, Salatiga", nameEng = "Satya Wacana Christian University, Salatiga", province = Province("Jawa Tengah".toSlug), address = "", website = "", active = true),
    Institution(id = "UNDANA", name = "Nusa Cendana University, Kupang", nameEng = "Nusa Cendana University, Kupang", province = Province("Nusa Tenggara Timur".toSlug), address = "", website = "", active = true),
    Institution(id = "USOEGI", name = "Soegijapranata Catholic University, Semarang", nameEng = "Soegijapranata Catholic University, Semarang", province = Province("Jawa Tengah".toSlug), address = "", website = "", active = true),
    Institution(id = "UNIMED", name = "State University of Medan, Medan", nameEng = "State University of Medan, Medan", province = Province("Sumatera Utara".toSlug), address = "", website = "", active = true),
    Institution(id = "UGM", name = "Gadjah Mada University, Yogyakarta", nameEng = "Gadjah Mada University, Yogyakarta", province = Province("D.I. Yogyakarta".toSlug), address = "", website = "", active = true),
    Institution(id = "UHANTU", name = "Hang Tuah University, Surabaya", nameEng = "Hang Tuah University, Surabaya", province = Province("Jawa Timur".toSlug), address = "", website = "", active = true),
    Institution(id = "UNP", name = "State University of Padang , Padang", nameEng = "State University of Padang , Padang", province = Province("Sumatera Barat".toSlug), address = "", website = "", active = true),
    Institution(id = "UNLAM", name = "Lambung Mangkurat University, Banjarmasin", nameEng = "Lambung Mangkurat University, Banjarmasin", province = Province("Kalimantan Selatan".toSlug), address = "", website = "", active = true),
    Institution(id = "UNNES", name = "State University of Semarang, Semarang", nameEng = "State University of Semarang, Semarang", province = Province("Jawa Tengah".toSlug), address = "", website = "", active = true),
    Institution(id = "UNSRAT", name = "Sam Ratulangi University, Manado", nameEng = "Sam Ratulangi University, Manado", province = Province("Sulawesi Utara".toSlug), address = "", website = "", active = true),
    Institution(id = "USD", name = "Sanata Dharma University, Yogyakarta", nameEng = "Sanata Dharma University, Yogyakarta", province = Province("D.I. Yogyakarta".toSlug), address = "", website = "", active = true),
    Institution(id = "UNWIRA", name = "Widya Mandira Catholic University, Kupang", nameEng = "Widya Mandira Catholic University, Kupang", province = Province("Nusa Tenggara Timur".toSlug), address = "", website = "", active = true),
    Institution(id = "UWKS", name = "Wijaya Kusuma Surabaya University, Surabaya", nameEng = "Wijaya Kusuma Surabaya University, Surabaya", province = Province("Jawa Timur".toSlug), address = "", website = "", active = true),
    Institution(id = "USU", name = "University of Sumatera Utara, Medan", nameEng = "University of Sumatera Utara, Medan", province = Province("Sumatera Utara".toSlug), address = "", website = "", active = true),
    Institution(id = "OTHER", name = "Other University/University Not Listed", nameEng = "Other University/University Not Listed", province = Province("D.I. Yogyakarta".toSlug), address = "", website = "", active = true),
    Institution(id = "REGPAC", name = "SMAK Regina Pacis, Bajawa", nameEng = "SMAK Regina Pacis, Bajawa", province = Province("Nusa Tenggara Timur".toSlug), address = "", website = "", active = true),
    Institution(id = "RvG", name = "RVG, Yogyakarta", nameEng = "RVG, Yogyakarta", province = Province("D.I. Yogyakarta".toSlug), address = "", website = "", active = true)
  )

}
