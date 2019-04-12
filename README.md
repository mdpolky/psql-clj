# psql-clj

Example jdbc and psql repo

## Installation

Assuming you have homebrew,
```
brew install postgresql
```

We are just using the sample psql db set-up from http://postgresguide.com/setup/example.html

Run these commands after you have psql command-line tools installed.
```
curl -L -O http://cl.ly/173L141n3402/download/example.dump
createdb pgguide
pg_restore --no-owner --dbname pgguide example.dump
psql --dbname pgguide
```

There is not much in core.clj at the moment, use it as a playground to explore/play around with data.

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
