node("cd") {
    git url: "https://github.com/vfarcic/${serviceName}.git"
    dockerFlow("go-demo", ["scale"])
}