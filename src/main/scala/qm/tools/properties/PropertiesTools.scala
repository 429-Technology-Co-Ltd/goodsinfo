package qm.tools.properties

import java.util.Properties

/**
 * @ClassName: qm.tools
 * @Description: 获取属性工具
 * @Author: LinYoung
 * @Date: 2021/5/26
 * @Time: 11:28
 */
object PropertiesTools {
  private[this] val properties = new Properties()

  properties.load(this.getClass.getResourceAsStream("/app.properties"))

  def getProperties: Properties = properties
}
