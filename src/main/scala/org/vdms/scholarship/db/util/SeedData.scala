package org.vdms.scholarship.db.util

import org.vdms.scholarship.db.entity._
import org.vdms.scholarship.db.repository._

/**
 * Created by Deny Prasetyo
 * 25 June 2015
 * Principal Software Development Engineer
 * GDP Labs
 * deny.prasetyo@gdplabs.id
 */


object SeedData {
  import org.vdms.scholarship.util.text.StringSlugUtil._

  val addrStatusList = List(
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

  val levelList = List(
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


  val incomeList = List(
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




  val sourceList = List(
    FundSource("Other".toSlug, "Lain-lain", "Other"),
    FundSource("Parents".toSlug, "Orang Tua", "Parents"),
    FundSource("Guardian".toSlug, "Wali", "Guardian"),
    FundSource("Self".toSlug, "Sendiri", "Self")
  )




  val statusList = List(
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
    Institution(i = "UNAIR", n = "Airlangga University, Surabaya", ne = "Airlangga University, Surabaya", pro = Province("Jawa Timur".toSlug), add = "", web = "", act = true),
    Institution(i = "ALFATH", n = "Al Fathonah Midwifery Academy, Jakarta", ne = "Al Fathonah Midwifery Academy, Jakarta", pro = Province("DKI Jakarta".toSlug), add = "", web = "", act = true),
    Institution(i = "ANDARA", n = "Andakara Nursery Academy, Jakarta", ne = "Andakara Nursery Academy, Jakarta", pro = Province("DKI Jakarta".toSlug), add = "", web = "", act = true),
    Institution(i = "UNAND", n = "Andalas University, Padang", ne = "Andalas University, Padang", pro = Province("Sumatera Barat".toSlug), add = "", web = "", act = true),
    Institution(i = "UKAW", n = "Artha Wacana Christian University, Kupang", ne = "Artha Wacana Christian University, Kupang", pro = Province("Nusa Tenggara Timur".toSlug), add = "", web = "", act = true),
    Institution(i = "UAJM", n = "Atma Jaya Makassar University, Makassar", ne = "Atma Jaya Makassar University, Makassar", pro = Province("Sulawesi Selatan".toSlug), add = "", web = "", act = true),
    Institution(i = "UBH", n = "Bung Hatta University, Padang", ne = "Bung Hatta University, Padang", pro = Province("Sumatera Barat".toSlug), add = "", web = "", act = true),
    Institution(i = "USALLE", n = "De La Salle University of Manado, Manado", ne = "De La Salle University of Manado, Manado", pro = Province("Sulawesi Utara".toSlug), add = "", web = "", act = true),
    Institution(i = "UNHAS", n = "Hasanuddin University, Makassar", ne = "Hasanuddin University, Makassar", pro = Province("Sulawesi Selatan".toSlug), add = "", web = "", act = true),
    Institution(i = "IPB", n = "Bogor Agricultural University, Bogor", ne = "Bogor Agricultural University, Bogor", pro = Province("Jawa Barat".toSlug), add = "", web = "", act = true),
    Institution(i = "ITB", n = "Bandung Institute of Technology", ne = "Bandung Institute of Technology", pro = Province("Jawa Barat".toSlug), add = "", web = "", act = true),
    Institution(i = "ITS", n = "Sepuluh Nopember Institute ot Technology", ne = "Sepuluh Nopember Institute ot Technology", pro = Province("Jawa Timur".toSlug), add = "", web = "", act = true),
    Institution(i = "UMACH", n = "Ma Chung University, Malang", ne = "Ma Chung University, Malang", pro = Province("Jawa Timur".toSlug), add = "", web = "", act = true),
    Institution(i = "UNPAD", n = "Padjadjaran University, Bandung", ne = "Padjadjaran University, Bandung", pro = Province("Jawa Barat".toSlug), add = "", web = "", act = true),
    Institution(i = "UNPATI", n = "Pattimura University, Ambon", ne = "Pattimura University, Ambon", pro = Province("Maluku".toSlug), add = "", web = "", act = true),
    Institution(i = "UPETRA", n = "Petra Christian University, Surabaya", ne = "Petra Christian University, Surabaya", pro = Province("Jawa Timur".toSlug), add = "", web = "", act = true),
    Institution(i = "STIKOM", n = "Universitas Uyelindo ,Kupang", ne = "Universitas Uyelindo ,Kupang", pro = Province("Nusa Tenggara Timur".toSlug), add = "", web = "", act = true),
    Institution(i = "STMUSI", n = "Sekolah Tinggi MUSI, Palembang", ne = "Sekolah Tinggi MUSI, Palembang", pro = Province("Sumatera Selatan".toSlug), add = "", web = "", act = true),
    Institution(i = "UNTAN", n = "Tanjungpura University, Pontianak", ne = "Tanjungpura University, Pontianak", pro = Province("Kalimantan Barat".toSlug), add = "", web = "", act = true),
    Institution(i = "UKDW", n = "Duta Wacana Christian University, Yogyakarta", ne = "Duta Wacana Christian University, Yogyakarta", pro = Province("D.I. Yogyakarta".toSlug), add = "", web = "", act = true),
    Institution(i = "UKIM", n = "Christian University of Indonesia in Maluku, Ambon", ne = "Christian University of Indonesia in Maluku, Ambon", pro = Province("Maluku".toSlug), add = "", web = "", act = true),
    Institution(i = "UKSW", n = "Satya Wacana Christian University, Salatiga", ne = "Satya Wacana Christian University, Salatiga", pro = Province("Jawa Tengah".toSlug), add = "", web = "", act = true),
    Institution(i = "UNDANA", n = "Nusa Cendana University, Kupang", ne = "Nusa Cendana University, Kupang", pro = Province("Nusa Tenggara Timur".toSlug), add = "", web = "", act = true),
    Institution(i = "USOEGI", n = "Soegijapranata Catholic University, Semarang", ne = "Soegijapranata Catholic University, Semarang", pro = Province("Jawa Tengah".toSlug), add = "", web = "", act = true),
    Institution(i = "UNIMED", n = "State University of Medan, Medan", ne = "State University of Medan, Medan", pro = Province("Sumatera Utara".toSlug), add = "", web = "", act = true),
    Institution(i = "UGM", n = "Gadjah Mada University, Yogyakarta", ne = "Gadjah Mada University, Yogyakarta", pro = Province("D.I. Yogyakarta".toSlug), add = "", web = "", act = true),
    Institution(i = "UHANTU", n = "Hang Tuah University, Surabaya", ne = "Hang Tuah University, Surabaya", pro = Province("Jawa Timur".toSlug), add = "", web = "", act = true),
    Institution(i = "UNP", n = "State University of Padang , Padang", ne = "State University of Padang , Padang", pro = Province("Sumatera Barat".toSlug), add = "", web = "", act = true),
    Institution(i = "UNLAM", n = "Lambung Mangkurat University, Banjarmasin", ne = "Lambung Mangkurat University, Banjarmasin", pro = Province("Kalimantan Selatan".toSlug), add = "", web = "", act = true),
    Institution(i = "UNNES", n = "State University of Semarang, Semarang", ne = "State University of Semarang, Semarang", pro = Province("Jawa Tengah".toSlug), add = "", web = "", act = true),
    Institution(i = "UNSRAT", n = "Sam Ratulangi University, Manado", ne = "Sam Ratulangi University, Manado", pro = Province("Sulawesi Utara".toSlug), add = "", web = "", act = true),
    Institution(i = "USD", n = "Sanata Dharma University, Yogyakarta", ne = "Sanata Dharma University, Yogyakarta", pro = Province("D.I. Yogyakarta".toSlug), add = "", web = "", act = true),
    Institution(i = "UNWIRA", n = "Widya Mandira Catholic University, Kupang", ne = "Widya Mandira Catholic University, Kupang", pro = Province("Nusa Tenggara Timur".toSlug), add = "", web = "", act = true),
    Institution(i = "UWKS", n = "Wijaya Kusuma Surabaya University, Surabaya", ne = "Wijaya Kusuma Surabaya University, Surabaya", pro = Province("Jawa Timur".toSlug), add = "", web = "", act = true),
    Institution(i = "USU", n = "University of Sumatera Utara, Medan", ne = "University of Sumatera Utara, Medan", pro = Province("Sumatera Utara".toSlug), add = "", web = "", act = true),
    Institution(i = "OTHER", n = "Other University/University Not Listed", ne = "Other University/University Not Listed", pro = Province("D.I. Yogyakarta".toSlug), add = "", web = "", act = true),
    Institution(i = "REGPAC", n = "SMAK Regina Pacis, Bajawa", ne = "SMAK Regina Pacis, Bajawa", pro = Province("Nusa Tenggara Timur".toSlug), add = "", web = "", act = true),
    Institution(i = "RvG", n = "RVG, Yogyakarta", ne = "RVG, Yogyakarta", pro = Province("D.I. Yogyakarta".toSlug), add = "", web = "", act = true)
  )

}
