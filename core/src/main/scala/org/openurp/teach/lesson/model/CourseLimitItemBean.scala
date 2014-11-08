package org.openurp.teach.lesson.model

import org.beangle.data.model.bean.LongIdBean
import org.openurp.teach.lesson.CourseLimitItem
import org.openurp.teach.lesson.CourseLimitGroup
import org.openurp.teach.lesson.CourseLimitMeta
import org.openurp.teach.lesson.Operator

class CourseLimitItemBean extends LongIdBean with CourseLimitItem {

  /** 限制具体项目 */
  var meta: CourseLimitMeta = _

  /** 所在限制组 */
  var group: CourseLimitGroup = _

  /** 操作符 */
  var operator: String = _

  /** 限制内容 */
  var content: String = _

}