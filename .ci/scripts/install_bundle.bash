#!/usr/bin/env bash

set -euo pipefail

echo "##### Configure Danger"

echo "##### Check Ruby version"
ruby --version
gem --version
bundler --version

echo "##### Install bundle"
gem install bundler
bundle config path 'vendor/cache'
bundle install --jobs 4 --retry 3 --gemfile=.ci/Gemfile
