def call(Map config=[:]) {
  //def action = new hudson.plugins.sidebar_link.LinkAction("http://www.darinpope.com/","testLinkFromDarin","star.gif")
  def action = new hudson.plugins.sidebar_link(config.url,config.text,config.icon)
  currentBuild.rawBuild.addAction(action)
}
