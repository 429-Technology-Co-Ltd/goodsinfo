package qm.tools.http

import com.alibaba.fastjson.JSON
import org.apache.http.client.methods.{HttpGet, HttpPost, HttpRequestBase}

import scala.collection.mutable

/**
 * @ClassName: qm.tools.http
 * @Description:
 * @Author:LinYoung
 * @Date: 2021/5/26
 * @Time: 11:25
 */
object HttpTools {

}

class HttpTools(method: String, url: String, header: String =
"""
  |{"Content-Type":"application/json"}
  |""".stripMargin) {

  var httpRequest: HttpRequestBase = _

  if (method == "GET") {
    httpRequest = new HttpGet(url)
  }
  else if (method == "POST") {
    httpRequest = new HttpPost(url)
  }
  if (header != null) {
    val json = JSON.parseObject(header)
    json.keySet().toArray.map(_.toString).foreach(key => httpRequest.setHeader(key, json.getString(key)))
  }

  def nlp_request(params: String): String = {
    if (params != null) {
      val body: mutable.Map[String, String] = mutable.Map()
      body += ("text" -> params)

    }
  }
}
