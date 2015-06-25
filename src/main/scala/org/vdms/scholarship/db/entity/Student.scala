package org.vdms.scholarship.db.entity

import java.time.{LocalDate, Year}
import javax.persistence._

import org.vdms.scholarship.db.value.StudentStatus.StudentStatus
import org.vdms.scholarship.util.value.Gender.Gender

import scala.beans.{BeanProperty, BooleanBeanProperty}

/**
 * Created by Deny Prasetyo
 * 25 June 2015
 * Principal Software Development Engineer
 * GDP Labs
 * deny.prasetyo@gdplabs.id
 */

@Entity
class Student {

  @Id
  @BeanProperty
  @Column(nullable = false)
  var username: String = _
  @BeanProperty
  @Column(nullable = false, unique = true)
  var email: String = _
  @BeanProperty
  @Column(nullable = false)
  var name: String = _
  @BeanProperty
  @Column(nullable = false)
  var gender: Gender = _
  @BeanProperty
  @Column(nullable = false)
  var birthPlace: String = _
  @BeanProperty
  @Column(nullable = false)
  var birthDate: LocalDate = _
  @BeanProperty
  @JoinColumn(nullable = false)
  @ManyToOne(fetch = FetchType.EAGER)
  var institution: Institution = _
  @BeanProperty
  @Column(nullable = false)
  var schoolEntryYear: Year = _
  @BeanProperty
  @Column(nullable = false)
  var vdmsEntryYear: Year = _
  @BeanProperty
  @JoinColumn(nullable = false)
  @ManyToOne(fetch = FetchType.EAGER)
  var discipline: Discipline = _
  @BeanProperty
  @Column(nullable = false)
  var studentIdNumber: String = _
  @BeanProperty
  @JoinColumn(nullable = false)
  @ManyToOne(fetch = FetchType.EAGER)
  var highSchoolProvince: Province = _
  @BeanProperty
  @Column(nullable = false)
  var faculty: String = _
  @BeanProperty
  @Column(nullable = false)
  var major: String = _
  @BeanProperty
  @JoinColumn(nullable = false)
  @ManyToOne(fetch = FetchType.EAGER)
  var level: EducationLevel = _
  @BeanProperty
  @Column(nullable = false)
  var city: String = _
  @BeanProperty
  @Column(nullable = false)
  var postCode: String = _
  @BeanProperty
  @Column(nullable = false)
  var activities: String = _
  @BeanProperty
  @Column(nullable = false)
  var gpa: Double = _
  @BeanProperty
  @Column(nullable = false)
  var phone: String = _
  @BeanProperty
  @Column(nullable = false)
  var address: String = _
  @BeanProperty
  @JoinColumn(nullable = false)
  @ManyToOne(fetch = FetchType.EAGER)
  var addressStatus: AddressStatus = _
  @BeanProperty
  @Column(nullable = false)
  var status: StudentStatus = _
  @BeanProperty
  @JoinColumn(nullable = false)
  @ManyToOne(fetch = FetchType.EAGER)
  var workingStatus: WorkingStatus = _
  @BeanProperty
  @Column(nullable = false)
  var occupation: String = _
  @BeanProperty
  @JoinColumn(nullable = false)
  @ManyToOne(fetch = FetchType.EAGER)
  var incomeRange: IncomeRange = _
  @BeanProperty
  @JoinColumn(nullable = false)
  @ManyToOne(fetch = FetchType.EAGER)
  var sourceOfFund: FundSource = _
  @BeanProperty
  @Column(nullable = false)
  var parentAddress: String = _
  @BeanProperty
  @JoinColumn(nullable = false)
  @ManyToOne(fetch = FetchType.EAGER)
  var parentEducationLevel: EducationLevel = _
  @BeanProperty
  @Column(nullable = false)
  var dependentOfParent: Int = _
  @BooleanBeanProperty
  @Column(nullable = false)
  var bothParentWorking: Boolean = _
  @BeanProperty
  @JoinColumn(nullable = false)
  @ManyToOne(fetch = FetchType.EAGER)
  var parentIncomeRange: IncomeRange = _
  @BeanProperty
  @JoinColumn(nullable = false)
  @ManyToOne(fetch = FetchType.EAGER)
  var parentOccupation: Occupation = _


  @BeanProperty
  var bankName: String = _
  @BeanProperty
  var graduationTarget: LocalDate = _
  @BeanProperty
  var bankAccountName: String = _
  @BeanProperty
  var bankAccountNumber: String = _
  @BeanProperty
  var toeflScore: Int = _
  @BeanProperty
  var alternativePhoneNumber: String = _

}

object Student {
  def apply(usernamePar: String,
            emailPar: String,
            namePar: String,
            genderPar: Gender,
            birthPlacePar: String,
            birthDatePar: LocalDate,
            institutionPar: Institution,
            schoolEntryYearPar: Year,
            vdmsEntryYearPar: Year,
            disciplinePar: Discipline,
            studentIdNumberPar: String,
            highSchoolProvincePar: Province,
            facultyPar: String,
            majorPar: String,
            levelPar: EducationLevel,
            cityPar: String,
            postCodePar: String,
            activitiesPar: String,
            gpaPar: Double,
            phonePar: String,
            addressPar: String,
            addressStatusPar: AddressStatus,
            statusPar: StudentStatus,
            workingStatusPar: WorkingStatus,
            occupationPar: String,
            incomeRangePar: IncomeRange,
            sourceOfFundPar: FundSource,
            parentAddressPar: String,
            parentEducationLevelPar: EducationLevel,
            dependentOfParentPar: Int,
            bothParentWorkingPar: Boolean,
            parentIncomeRangePar: IncomeRange,
            parentOccupationPar: Occupation,
            bankNamePar: Option[String] = None,
            graduationTargetPar: Option[LocalDate] = None,
            bankAccountNamePar: Option[String] = None,
            bankAccountNumberPar: Option[String] = None,
            toeflScorePar: Option[Int] = None,
            alternativePhoneNumberPar: Option[String] = None): Student = {
    val o = new Student()

    o.username =  usernamePar
    o.email =  emailPar
    o.name =  namePar
    o.gender =  genderPar
    o.birthPlace =  birthPlacePar
    o.birthDate =  birthDatePar
    o.institution =  institutionPar
    o.schoolEntryYear =  schoolEntryYearPar
    o.vdmsEntryYear =  vdmsEntryYearPar
    o.discipline =  disciplinePar
    o.studentIdNumber =  studentIdNumberPar
    o.highSchoolProvince =  highSchoolProvincePar
    o.faculty =  facultyPar
    o.major =  majorPar
    o.level =  levelPar
    o.city =  cityPar
    o.postCode =  postCodePar
    o.activities =  activitiesPar
    o.gpa =  gpaPar
    o.phone =  phonePar
    o.address =  addressPar
    o.addressStatus =  addressStatusPar
    o.status =  statusPar
    o.workingStatus =  workingStatusPar
    o.occupation =  occupationPar
    o.incomeRange =  incomeRangePar
    o.sourceOfFund =  sourceOfFundPar
    o.parentAddress =  parentAddressPar
    o.parentEducationLevel =  parentEducationLevelPar
    o.dependentOfParent =  dependentOfParentPar
    o.bothParentWorking =  bothParentWorkingPar
    o.parentIncomeRange =  parentIncomeRangePar
    o.parentOccupation =  parentOccupationPar
    o.bankName =  bankNamePar.fold("")(s=>s)
    o.graduationTarget =  graduationTargetPar.fold(LocalDate.now())(s=>s)
    o.bankAccountName =  bankAccountNamePar.fold("")(s=>s)
    o.bankAccountNumber =  bankAccountNumberPar.fold("")(s=>s)
    o.toeflScore =  toeflScorePar.fold(0)(s=>s)
    o.alternativePhoneNumber =  alternativePhoneNumberPar.fold("")(s=>s)

    o
  }
}