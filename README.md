# Mill Logging Problem Reproducer
When running `./mill showNamed tmp.jar 2>/dev/null | jq -r '."tmp.jar"'` from the laptop, _only_ the
jar path is output, and it works the same in github actions; [see here](https://github.com/btrachey/mill-repro/actions/runs/12990641281/job/36226317956).
It seems like there's some different behavior in the ScalaNative module though, as a similar
workflow running `./mill showNamed tmp.nativeLink 2>/dev/null | jq -r '."tmp.nativeLink"'` causes a
jq parse error in github actions; [see here](https://github.com/btrachey/mill-repro/actions/runs/12990754628/job/36226692088).
