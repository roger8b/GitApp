#!/usr/bin/env bash

set -euo pipefail

echo "##### Execute Danger"
bundle exec --gemfile=.ci/Gemfile danger --dangerfile=".ci/danger/statchic_analysis.Dangerfile" --danger_id='static_analysis' --remove-previous-comments --fail-on-errors=true
