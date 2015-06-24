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
class Student(usernamePar: String,
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
              alternativePhoneNumberPar: Option[String] = None) {

  @Id
  @BeanProperty
  @Column(nullable = false)
  var username: String = usernamePar
  @BeanProperty
  @Column(nullable = false, unique = true)
  var email: String = emailPar
  @BeanProperty
  @Column(nullable = false)
  var name: String = namePar
  @BeanProperty
  @Column(nullable = false)
  var gender: Gender = genderPar
  @BeanProperty
  @Column(nullable = false)
  var birthPlace: String = birthPlacePar
  @BeanProperty
  @Column(nullable = false)
  var birthDate: LocalDate = birthDatePar
  @BeanProperty
  @JoinColumn(nullable = false)
  @ManyToOne(fetch = FetchType.EAGER)
  var institution: Institution = institutionPar
  @BeanProperty
  @Column(nullable = false)
  var schoolEntryYear: Year = schoolEntryYearPar
  @BeanProperty
  @Column(nullable = false)
  var vdmsEntryYear: Year = vdmsEntryYearPar
  @BeanProperty
  @JoinColumn(nullable = false)
  @ManyToOne(fetch = FetchType.EAGER)
  var discipline: Discipline = disciplinePar
  @BeanProperty
  @Column(nullable = false)
  var studentIdNumber: String = studentIdNumberPar
  @BeanProperty
  @JoinColumn(nullable = false)
  @ManyToOne(fetch = FetchType.EAGER)
  var highSchoolProvince: Province = highSchoolProvincePar
  @BeanProperty
  @Column(nullable = false)
  var faculty: String = facultyPar
  @BeanProperty
  @Column(nullable = false)
  var major: String = majorPar
  @BeanProperty
  @JoinColumn(nullable = false)
  @ManyToOne(fetch = FetchType.EAGER)
  var level: EducationLevel = levelPar
  @BeanProperty
  @Column(nullable = false)
  var city: String = cityPar
  @BeanProperty
  @Column(nullable = false)
  var postCode: String = postCodePar
  @BeanProperty
  @Column(nullable = false)
  var activities: String = activitiesPar
  @BeanProperty
  @Column(nullable = false)
  var gpa: Double = gpaPar
  @BeanProperty
  @Column(nullable = false)
  var phone: String = phonePar
  @BeanProperty
  @Column(nullable = false)
  var address: String = addressPar
  @BeanProperty
  @JoinColumn(nullable = false)
  @ManyToOne(fetch = FetchType.EAGER)
  var addressStatus: AddressStatus = addressStatusPar
  @BeanProperty
  @Column(nullable = false)
  var status: StudentStatus = statusPar
  @BeanProperty
  @JoinColumn(nullable = false)
  @ManyToOne(fetch = FetchType.EAGER)
  var workingStatus: WorkingStatus = workingStatusPar
  @BeanProperty
  @Column(nullable = false)
  var occupation: String = occupationPar
  @BeanProperty
  @JoinColumn(nullable = false)
  @ManyToOne(fetch = FetchType.EAGER)
  var incomeRange: IncomeRange = incomeRangePar
  @BeanProperty
  @JoinColumn(nullable = false)
  @ManyToOne(fetch = FetchType.EAGER)
  var sourceOfFund: FundSource = sourceOfFundPar
  @BeanProperty
  @Column(nullable = false)
  var parentAddress: String = parentAddressPar
  @BeanProperty
  @JoinColumn(nullable = false)
  @ManyToOne(fetch = FetchType.EAGER)
  var parentEducationLevel: EducationLevel = parentEducationLevelPar
  @BeanProperty
  @Column(nullable = false)
  var dependentOfParent: Int = dependentOfParentPar
  @BooleanBeanProperty
  @Column(nullable = false)
  var bothParentWorking: Boolean = bothParentWorkingPar
  @BeanProperty
  @JoinColumn(nullable = false)
  @ManyToOne(fetch = FetchType.EAGER)
  var parentIncomeRange: IncomeRange = parentIncomeRangePar
  @BeanProperty
  @JoinColumn(nullable = false)
  @ManyToOne(fetch = FetchType.EAGER)
  var parentOccupation: Occupation = parentOccupationPar


  @BeanProperty
  var bankName: String = bankNamePar.fold("")(s => s)
  @BeanProperty
  var graduationTarget: LocalDate = graduationTargetPar.orNull
  @BeanProperty
  var bankAccountName: String = bankAccountNamePar.fold("")(s => s)
  @BeanProperty
  var bankAccountNumber: String = bankAccountNumberPar.fold("")(s => s)
  @BeanProperty
  var toeflScore: Int = toeflScorePar.fold(0)(s => s)
  @BeanProperty
  var alternativePhoneNumber: String = alternativePhoneNumberPar.fold("")(s => s)

}
