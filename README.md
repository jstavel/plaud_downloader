# jstavel/plaud_downloader

A Clojure CLI tool to download my own audio recordings and transcripts out of
[Plaud](https://www.plaud.ai) — audio and transcripts in, a plain local
knowledge base out. The tool drives a local Chrome browser over the
**Chrome DevTools Protocol** ([clj-chrome-devtools](https://github.com/tolitius/clj-chrome-devtools)),
so it operates the same pages the vendor's web app uses, without a private API
and without stored credentials in the repo.

**Status: early prototype.** The current capability is `login-and-check` —
connect to a locally running Chrome with a CDP port, navigate to plaud.ai,
and return the page title. The download pipeline is specced in
[`doc/intro.md`](doc/intro.md) and lands capability by capability.

## Why public at prototype stage

The point of this repo is as much the *way of working* as the tool: each
capability has a stated use case, malli contracts for its inputs/outputs
(`doc/contracts/`), a workflow descriptor (`doc/workflow.hcl`), and tests —
written before the implementation. AI agents do the building; the spec, the
contracts, and the review are the human-owned part.

## Prerequisites

- JVM + [Clojure CLI](https://clojure.org/guides/install_clojure)
- Chromium/Chrome running with a remote debugging port, e.g.
  `chromium --remote-debugging-port=9222`

## Usage

```shell
clojure -X:run-x :port 9222
```

## Development

```shell
clojure -T:build test    # run tests
clojure -T:build ci      # CI pipeline + uberjar
```

See [CONTRIBUTING.md](CONTRIBUTING.md) for the contract-first workflow this
repo follows.

## License

Distributed under the Eclipse Public License version 1.0. Copyright © 2026 Jan Stável.
