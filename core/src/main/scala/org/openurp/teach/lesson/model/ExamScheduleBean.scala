package org.openurp.teach.lesson.model

import org.beangle.data.model.bean.LongIdBean
import org.openurp.teach.code.ExamType
import org.openurp.teach.exam.ExamActivity
import org.openurp.teach.lesson.ExamSchedule

class ExamScheduleBean extends LongIdBean with ExamSchedule {

  /** 具体排考结果 */
  var activities: collection.mutable.Set[ExamActivity] = _

  /** 考试类型 */
  var examTypes: collection.mutable.Set[ExamType] = _

  //  fix me 
  //  public List<Classroom> getExamRooms(ExamBatch examBatch) {

  /**
   * 返回主考老师
   */
  //  fix me
  //  public List<Teacher> getExaminers(ExamBatch examBatch) {

  /**
   * @return Returns the activities.
   */
  //  fix me
  //  public ExamActivity getActivity(ExamBatch examBatch) {

  //  fix me
  //  public ExamSchedule clone() {
}