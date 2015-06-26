package org.jasoet.scholarship.db.entity

import java.time.{LocalDate, Year}
import javax.persistence._

import org.jasoet.scholarship.db.value.StudentStatus
import org.jasoet.scholarship.db.value.StudentStatus.StudentStatus
import org.jasoet.scholarship.util.value.Gender
import org.jasoet.scholarship.util.value.Gender.Gender

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
  def apply(username: String,
            email: String,
            name: String,
            gender: Gender,
            birthPlace: String,
            birthDate: LocalDate,
            institution: Institution,
            schoolEntryYear: Year,
            vdmsEntryYear: Year,
            discipline: Discipline,
            studentIdNumber: String,
            highSchoolProvince: Province,
            faculty: String,
            major: String,
            level: EducationLevel,
            city: String,
            postCode: String,
            activities: String,
            gpa: Double,
            phone: String,
            address: String,
            addressStatus: AddressStatus,
            status: StudentStatus,
            workingStatus: WorkingStatus,
            occupation: String,
            incomeRange: IncomeRange,
            sourceOfFund: FundSource,
            parentAddress: String,
            parentEducationLevel: EducationLevel,
            dependentOfParent: Int,
            bothParentWorking: Boolean,
            parentIncomeRange: IncomeRange,
            parentOccupation: Occupation,
            bankName: Option[String] = None,
            graduationTarget: Option[LocalDate] = None,
            bankAccountName: Option[String] = None,
            bankAccountNumber: Option[String] = None,
            toeflScore: Option[Int] = None,
            alternativePhoneNumber: Option[String] = None): Student = {
    val o = new Student()

    o.username = username
    o.email = email
    o.name = name
    o.gender = gender
    o.birthPlace = birthPlace
    o.birthDate = birthDate
    o.institution = institution
    o.schoolEntryYear = schoolEntryYear
    o.vdmsEntryYear = vdmsEntryYear
    o.discipline = discipline
    o.studentIdNumber = studentIdNumber
    o.highSchoolProvince = highSchoolProvince
    o.faculty = faculty
    o.major = major
    o.level = level
    o.city = city
    o.postCode = postCode
    o.activities = activities
    o.gpa = gpa
    o.phone = phone
    o.address = address
    o.addressStatus = addressStatus
    o.status = status
    o.workingStatus = workingStatus
    o.occupation = occupation
    o.incomeRange = incomeRange
    o.sourceOfFund = sourceOfFund
    o.parentAddress = parentAddress
    o.parentEducationLevel = parentEducationLevel
    o.dependentOfParent = dependentOfParent
    o.bothParentWorking = bothParentWorking
    o.parentIncomeRange = parentIncomeRange
    o.parentOccupation = parentOccupation
    o.bankName = bankName.fold("")(s => s)
    o.graduationTarget = graduationTarget.fold(LocalDate.now())(s => s)
    o.bankAccountName = bankAccountName.fold("")(s => s)
    o.bankAccountNumber = bankAccountNumber.fold("")(s => s)
    o.toeflScore = toeflScore.fold(0)(s => s)
    o.alternativePhoneNumber = alternativePhoneNumber.fold("")(s => s)

    o
  }
}