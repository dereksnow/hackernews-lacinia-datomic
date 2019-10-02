(ns datomic-schema)

(def hacker-schema

  [{:db/ident :link/id
    :db/valueType :db.type/uuid
    :db/cardinality :db.cardinality/one
    :db/unique :db.unique/identity}
   {:db/ident :link/url
    :db/valueType :db.type/string
    :db/cardinality :db.cardinality/one}
   {:db/ident :link/description
    :db/valueType :db.type/string
    :db/cardinality :db.cardinality/one}
   {:db/ident :link/postedby
    :db/valueType :db.type/ref
    :db/cardinality :db.cardinality/one}
   {:db/ident :link/votes
    :db/valueType :db.type/ref
    :db/cardinality :db.cardinality/many}
   {:db/ident :link/createdat
    :db/valueType :db.type/instant
    :db/cardinality :db.cardinality/one}

  {:db/ident :auth/token
    :db/valueType :db.type/string
    :db/cardinality :db.cardinality/one}
   {:db/ident :auth/user
    :db/valueType :db.type/ref
    :db/cardinality :db.cardinality/one}

  {:db/ident :user/id
    :db/valueType :db.type/uuid
    :db/cardinality :db.cardinality/one
    :db/unique :db.unique/identity}
   {:db/ident :user/name
    :db/valueType :db.type/string
    :db/cardinality :db.cardinality/one}
   {:db/ident :user/email
    :db/valueType :db.type/string
    :db/cardinality :db.cardinality/one
    :db/unique :db.unique/identity}
   {:db/ident :user/links
    :db/valueType :db.type/ref
    :db/cardinality :db.cardinality/many}

  {:db/ident :vote/id
    :db/valueType :db.type/uuid
    :db/cardinality :db.cardinality/one
    :db/unique :db.unique/identity}
   {:db/ident :vote/link
    :db/valueType :db.type/ref
    :db/cardinality :db.cardinality/one}
   {:db/ident :vote/user
    :db/valueType :db.type/ref
    :db/cardinality :db.cardinality/one}])
