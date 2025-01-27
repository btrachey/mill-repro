# Mill Logging Problem Reproducer
When running `./mill showNamed tmp.jar 2>/dev/null | jq -r '."tmp.jar"'` from the laptop, _only_ the
jar path is output. But looking at the running github action, the same command throws an error in jq
because of a parsing error, which makes it seem like the mill logging is output to stdout instead of
stderr in github actions.
