#!/usr/bin/env bash

set -euo pipefail

echo "##### Install Ktlint"
# brew install ktlint

echo "##### Execute Danger"
bundle exec --gemfile=.ci/Gemfile danger --dangerfile=".ci/danger/static_analysis.Dangerfile" --danger_id='static_analysis' --remove-previous-comments --fail-on-errors=true
