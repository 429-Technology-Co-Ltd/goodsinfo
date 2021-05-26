package qm.tools.base64

import java.util.Base64

/**
 * @ClassName: qm.tools
 * @Description: base64工具
 * @Author: LinYoung
 * @Date: 2021/4/15
 * @Time: 20:21
 */
object Base64Tools {
  //Base64编码
  private[this] val encoder: Base64.Encoder = Base64.getEncoder

  def encode(str: String): String = {
    encoder.encodeToString(str.getBytes)
  }
}
