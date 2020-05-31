#!/usr/bin/env bash

set -euo pipefail

echo "Configure Danger"

echo "Check Ruby version"
ruby --version
gem --version
bundler --version

echo "Install bundle"
bundle install --jobs 4 --retry 3

echo "Execute Danger"

#bundle exec --gemfile=.ci/Gemfile danger --dangerfile=".ci/danger/static_analysis.Dangerfile" --danger_id='static_analysis' --remove-previous-comments --fail-on-errors=true