#!/usr/bin/env bash

set -euo pipefail

echo "##### Install Ktlint"
curl --output /usr/local/bin/ktlint -sL https://github.com/pinterest/ktlint/releases/download/0.36.0/ktlint && chmod a+x /usr/local/bin/ktlint

echo "##### Execute Danger"
bundle exec --gemfile=.ci/Gemfile danger --dangerfile=".ci/danger/static_analysis.Dangerfile" --danger_id='static_analysis' --remove-previous-comments --fail-on-errors=true
