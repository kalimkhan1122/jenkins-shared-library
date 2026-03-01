def call(String url, String branch){
  echo 'This is clonnig the Code'
  git url: "${url}", branch: "${branch}"
  echo 'Clone Successfully'
}
