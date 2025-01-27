# Mill Logging Problem Reproducer
When running `./mill showNamed tmp.jar | jq -r '."tmp.jar"'` from the laptop, _only_ the
jar path is output, and it works the same in github actions.
It seems like there's some different behavior in the ScalaNative module though, as a similar
workflow running `./mill showNamed tmp.nativeLink | jq -r '."tmp.nativeLink"'` causes a
jq parse error in github actions, but not on the laptop.

Compare the `demo-jar-command` against `demo-nativeLink-command` job in
[this](https://github.com/btrachey/mill-repro/actions/runs/12991007492) github actions run.
